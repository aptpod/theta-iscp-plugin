package com.aptpod.theta.plugin.iscpstreaming.iscp

import android.util.Log
import com.aptpod.ApiClient
import com.aptpod.intdash.AuthOAuth2Api
import com.aptpod.intdash.MeasMeasurementsApi
import com.aptpod.iscp.connection.Connection
import com.aptpod.iscp.encoding.EncodingName
import com.aptpod.iscp.logger.IscpLog
import com.aptpod.iscp.logger.IscpLogLevel
import com.aptpod.iscp.model.*
import com.aptpod.iscp.stream.Upstream
import com.aptpod.iscp.stream.UpstreamCallbacks
import com.aptpod.iscp.transport.ITransportConfig
import com.aptpod.iscp.transport.TransportType
import com.aptpod.iscp.transport.WebSocketConfig
import com.aptpod.theta.plugin.iscpstreaming.helpers.MySystemClock
import org.openapitools.client.model.IssueToken200Response
import org.openapitools.client.model.MeasCreate
import org.openapitools.client.model.MeasurementBaseTimeType
import org.openapitools.client.model.MeasurementSequenceGroupReplace
import java.util.*
import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.ReentrantLock

class IscpConnection {

    companion object {
        const val TAG = "IscpConnection"

        val ISCP_LOG_LEVEL: IscpLogLevel = IscpLogLevel.INFO
        const val DATA_POINT_CHANNEL: Int = 1

        /**
         * トランスポートのタイプ
         */
        val TRANSPORT_TYPE: TransportType = TransportType.WEBSOCKET
        /**
         * メッセージのエンコード形式
         */
        val ENCODING_NAME: EncodingName = EncodingName.PROTOBUF
        /**
         * タイムアウトする期間
         */
        const val TIMEOUT_DURATION: Int = 5//3//1
        /**
         * ストリーム切断時の有効な期間。
         */
        const val STREAM_EXPIRY_INTERVAL: Short = 60
        /**
         * データポイントのフラッシュ方法。
         */
        val UPSTREAM_DATA_POINTS_FLUSH_POLICY: FlushPolicy = FlushPolicy.immediately()
    }

    var targetUrl: String = "https://example.com"
    var serverPath: String = "/api"
    var nodeId: String = "00000000-0000-0000-0000-000000000000"
    var nodeSecret: String = ""
    var saveToServer: Boolean = false

    var accessToken: String? = null
        private set
    var refreshToken: String? = null
        private set
    var expiresIn: Long? = null
        private set
    var refreshTokenExpiresIn: Long? = null
        private set
    var acquiredTime: Date? = null
        private set
    private val refreshTokenLock: ReentrantLock = ReentrantLock()

    private var connection: Connection? = null
    var upstream: Upstream? = null
        private set
    private var upstreams: MutableList<Upstream> = mutableListOf()
    private var usedUpstreams: MutableList<Upstream> = mutableListOf()
    private var upstreamLock = ReentrantLock()
    var measurementId: String? = null
        private set
    var generatedSequences: ULong = 0u
        private set
    var receivedSequences: ULong = 0u
        private set
    private var failedSendDataPoints: MutableMap<UUID, MutableList<DataPointGroup>> = mutableMapOf()

    var baseTime: Long? = null

    val isUpstreaming: Boolean
        get() {
            return baseTime != null && upstream != null
        }

    constructor() {
        IscpLog.Shared.level = ISCP_LOG_LEVEL
    }

    fun connect() {
        if (targetUrl.isNullOrEmpty()) throw Exception("targetServer not found.")
        if (serverPath.isNullOrEmpty()) throw Exception("serverPath not found.")
        if (nodeId.isNullOrEmpty()) throw Exception("nodeId not found.")
        if (nodeSecret.isNullOrEmpty()) throw Exception("nodeSecret not found.")

        requestAccessToken()

        // Parse Address
        var urls = targetUrl.split("://")
        var address: String
        var enableTls: Boolean = false
        if (urls.size == 1)
        {
            address = urls[0]
        }
        else
        {
            enableTls = urls[0] == "https"
            address = urls[1]
        }

        Log.d(TAG, "Try open client. address: $address, enableTls: $enableTls")
        var tokenSource: () -> String = {
            Log.d(TAG, "request tokenSource")
            var apiClient = ApiClient()
            apiClient.basePath = targetUrl + serverPath
            var res = AuthOAuth2Api(apiClient).issueToken(
                "client_credentials",
                "", null, "", "",
                nodeId,
                nodeSecret,
                null, null, null, null)
            Log.d(TAG, "tokenSource: ${res.accessToken ?: ""}")
            res.accessToken ?: ""
        }
        var transportConfig: ITransportConfig
        when (TRANSPORT_TYPE) {
            TransportType.WEBSOCKET -> {
                transportConfig = WebSocketConfig(enableTls = enableTls)
            }
        }
        var (connection, connectionError) = Connection.connect(
            address = address,
            transportConfig = transportConfig,
            tokenSource = tokenSource,
            nodeId = nodeId,
            pingTimeout = TIMEOUT_DURATION,
            encoding = ENCODING_NAME
        )
        if (connection == null) throw connectionError ?: Exception("Connect.connect() error.")
        this.connection = connection

        if (saveToServer) {
            var (measId, requestCreateMeasurementError) = requestCreateMeasurement(MySystemClock.Shared.rtcDate, MeasurementBaseTimeType.EDGE_RTC, connection.nodeId)
            if (requestCreateMeasurementError != null) throw requestCreateMeasurementError
            invokeOpenUpstream(connection, MySystemClock.Shared.rtcUnixNanoTime, measId!!)
        } else {
            invokeOpenUpstream(connection, MySystemClock.Shared.rtcUnixNanoTime)
        }
    }

    fun close() {
        this.upstreamLock.lock()
        var connection = this.connection
        var upstreams = this.upstreams
        var usedUpstreams = this.usedUpstreams
        var measurementId = this.measurementId
        this.connection = null
        this.upstream = null
        this.baseTime = null
        this.upstreams = mutableListOf()
        this.usedUpstreams = mutableListOf()
        this.failedSendDataPoints.clear()
        this.upstreamLock.unlock()
        Thread {
            for (i in 0 until upstreams.size) {
                var u = upstreams[i]
                var closeSession = i == (upstreams.size-1)
                var err = u.close(closeSession = closeSession)
                if (err != null) {
                    Log.e(TAG, "Failed to close upstream(ID: ${u.id}), $err")
                    return@Thread
                }
                Log.d(TAG, "Success to close upstream(ID: ${u.id})")
            }
            this.upstreamLock.lock()
            var generatedSequences = this.generatedSequences
            var receivedSequences = this.receivedSequences
            this.upstreamLock.unlock()
            connection?.let { connection ->
                connection.closeAsync()
            }
            if (!measurementId.isNullOrEmpty()) {
                if (generatedSequences == receivedSequences) {
                    Log.d(TAG, "requestCompleteMeasurementAsync measurementUuid: $measurementId")
                    var err = requestCompleteMeasurement(
                        measurementUuid = measurementId
                    )
                    if (err != null) {
                        Log.e(TAG, "requestCompleteMeasurement error. $err")
                        return@Thread
                    }
                    Log.d(TAG, "requestCompleteMeasurement successfully.")
                }
                else
                {
                    Log.d(TAG,"dropped measurement data. measurementId: $measurementId, generatedSequences: $generatedSequences, receivedSequences: $receivedSequences")
                    for (u in usedUpstreams) {
                        var state = u.getState()
                        var sequencesUuid = u.id.toString()
                        var expectedDataPoints = state.totalDataPoints
                        var finalSequenceNumber = state.lastIssuedSequenceNumber
                        Log.d(TAG,"requestUpdateMeasurementSequence sequencesUuid: $sequencesUuid, measurementUuid: $measurementId, expectedDataPoints: $expectedDataPoints, finalSequenceNumber: $finalSequenceNumber")
                        var err = requestUpdateMeasurementSequence(
                            sequencesUuid = sequencesUuid,
                            measurementUuid = measurementId,
                            expectedDataPoints = expectedDataPoints.toLong(),
                            finalSequenceNumber = finalSequenceNumber.toLong()
                        )
                        if (err != null) {
                            Log.e(TAG, "requestUpdateMeasurementSequence error. ${err.javaClass.name}, streamId: ${u.id}, expectedDataPoints: $expectedDataPoints, finalSequenceNumber: $finalSequenceNumber), $err")
                            return@Thread
                        }
                        Log.d(TAG, "requestUpdateMeasurementSequence successfully. streamId: ${u.id}, expectedDataPoints: $expectedDataPoints, finalSequenceNumber: $finalSequenceNumber")
                    }
                    Log.d(TAG, "requestEndMeasurement measurementUuid: $measurementId")
                    var err = requestEndMeasurement(
                        measurementUuid = measurementId
                    )
                    if (err != null) {
                        Log.e(TAG, "requestEndMeasurement error. $err")
                        return@Thread
                    }
                    Log.d(TAG, "requestEndMeasurement successfully.")
                }
            }
        }.start()
    }

    //region for iSCP

    private fun invokeOpenUpstream(connection: Connection, baseTime: Long, measId: String = "") {
        var (upstream, exception) = connection.openUpstream(
            sessionId = measId,
            expiryInterval = STREAM_EXPIRY_INTERVAL,
            persist = saveToServer,
            flushPolicy = UPSTREAM_DATA_POINTS_FLUSH_POLICY
        )
        if (upstream == null) throw exception ?: Exception("connection.openUpstream() error.")
        Log.d(TAG, "Successfully open upstream(id: ${upstream.id})")
        upstream.callbacks = upstreamCallbacks
        this.upstreamLock.lock()
        this.measurementId = measId
        this.upstream = upstream
        this.upstreams.add(upstream)
        this.usedUpstreams.add(upstream)
        this.upstreamLock.unlock()
        sendFirstData(connection, baseTime, measId)
    }

    private fun sendFirstData(connection: Connection, baseTime: Long, measId: String = "") {
        Log.d(TAG, "sendFirstData(baseTime: $baseTime, measId: $measId)")
        // Send first data
        var metadata = BaseTime(sessionId = measId, name = "manual", priority = 1000, elapsedTime = 0, baseTime = baseTime)
        var err = connection.sendBaseTime(baseTime = metadata, persist = saveToServer)
        if (err != null) throw err
        Log.d(TAG, "Success to send baseTime.")
        this.baseTime = baseTime
    }

    private fun sendDataPoint(upstream: Upstream, groups: List<DataPointGroup>) {
        var err = upstream.writeDataPoints(groups)
        if (err != null) {
            Log.w(TAG, "Failed to send upstream[${upstream.id}] data points. ${err.javaClass.name}")
            err.printStackTrace()
            var buffer = mutableListOf<DataPointGroup>()
            if (this.failedSendDataPoints.containsKey(upstream.id)) {
                buffer = this.failedSendDataPoints[upstream.id]!!
            }
            buffer.addAll(groups)
            this.failedSendDataPoints[upstream.id] = buffer
            return
        }
    }

    val upstreamCallbacks: UpstreamCallbacks
        get() = object : UpstreamCallbacks {
            override fun onGenerateChunk(upstream: Upstream, message: UpstreamChunk) {
                Log.d(TAG, "onGenerateChunk upstream[${upstream.id}], sequenceNumber: ${message.sequenceNumber}, dataPointCount: ${message.dataPointCount}, payloadSize: ${message.payloadSize} - UpstreamCallbacks")
                generatedSequences += 1u
            }

            override fun onReceiveAck(upstream: Upstream, message: UpstreamChunkAck) {
                Log.d(TAG, "onReceiveAck upstream[${upstream.id}], sequenceNumber: ${message.sequenceNumber}, resultCode: ${message.resultCode}, resultString: ${message.resultString} - UpstreamCallbacks")
                receivedSequences += 1u
            }

            override fun onFailWithError(upstream: Upstream, error: Exception) {
                Log.d(TAG, "onFailWithError upstream[${upstream.id}], error: ${error.javaClass.name} - UpstreamCallbacks")
                error.printStackTrace()
            }

            override fun onCloseWithError(upstream: Upstream, error: Exception) {
                Log.d(TAG, "onCloseWithError upstream[${upstream.id}], error: ${error.javaClass.name} - UpstreamCallbacks")
                error.printStackTrace()
                connection?.reopenUpstreamAsync(upstream = upstream) { newStream, error ->
                    if (newStream == null || error != null) {
                        Log.e(TAG, "reopenUpstream failed. ${error?.javaClass?.name ?: ""}")
                        return@reopenUpstreamAsync
                    }
                    try {
                        upstreamLock.lock()
                        var index = upstreams.indexOf(upstream)
                        if (index >= 0) {
                            upstreams.removeAt(index)
                        }
                        else {
                            return@reopenUpstreamAsync
                        }
                        this@IscpConnection.upstream = newStream
                        upstreams.add(newStream)
                        usedUpstreams.add(newStream)
                        newStream.callbacks = upstreamCallbacks
                        // 未送信のデータを持っていれば送信する
                        failedSendDataPoints[upstream.id]?.let { groups ->
                            sendDataPoint(newStream, groups)
                            groups.clear()
                        }
                        Log.d(TAG, "reopenUpstream successfully, new upstream[${newStream.id}]")
                        Thread {
                            // 不要になったストリームを閉じる(解放する)
                            upstream.closeAsync()
                        }.start()
                    }
                    finally {
                        upstreamLock.unlock()
                    }
                }
            }

            override fun onResume(upstream: Upstream) {
                Log.d(TAG, "onResume upstream[${upstream.id}] - UpstreamCallbacks")
            }
        }

    //endregion

    //region for API Client

    private fun requestAccessToken() : String? {
        Log.d(TAG, "requestAccessToken()")
        var apiClient = ApiClient()
        apiClient.basePath = targetUrl + serverPath
        var res = AuthOAuth2Api(apiClient).issueToken(
            "client_credentials",
            "", null, "", "",
            nodeId,
            nodeSecret,
            null, null, null, null)
        Log.d(TAG, "accessToken: ${res.accessToken ?: ""}")
        processAccessTokenResponse(res)
        return res.accessToken
    }

    fun requestRefreshTokenToken() : Pair<Date?, Exception?> {
        try {
            var apiClient = ApiClient()
            apiClient.basePath = targetUrl + serverPath
            var api = AuthOAuth2Api(apiClient)
            var res = api.issueToken(
                "refresh_token",
                refreshToken,
                null,
                "",
                "",
                nodeId,
                "",
                "",
                null,
                null,
                null)
            return processAccessTokenResponse(res)
        }
        catch (e: Exception) {
            return Pair(null, e)
        }
    }

    private val isAccessTokenRefreshable: Boolean
        get() {
            var acquiredTime = this.acquiredTime ?: return false
            // 残り秒数
            var expiresIn = this.expiresIn ?: return false
            // 経過秒数と比較
            var now = Date().time
            var elapsedTime = now - acquiredTime.time
            return elapsedTime < expiresIn
        }

    private fun getEnableToken() : String? {
        this.refreshTokenLock.lock()
        if (isAccessTokenRefreshable) {
            this.refreshTokenLock.unlock()
            return accessToken
        }
        requestRefreshTokenToken()
        this.refreshTokenLock.unlock()
        return if (this.isAccessTokenRefreshable) this.accessToken else null
    }

    private fun processAccessTokenResponse(data: IssueToken200Response) : Pair<Date?, Exception?> {
        var now = Date()
        this.accessToken = data.accessToken
        this.refreshToken = data.refreshToken
        this.expiresIn = TimeUnit.MILLISECONDS.convert(data.expiresIn ?: 0, TimeUnit.SECONDS)
        this.refreshTokenExpiresIn = TimeUnit.MILLISECONDS.convert(data.refreshTokenExpiresIn ?: 0, TimeUnit.SECONDS)
        this.acquiredTime = now
        var expirationDate: Date? = null
        this.expiresIn?.let {
            expirationDate = Date(now.time + TimeUnit.MILLISECONDS.convert(it, TimeUnit.SECONDS))
        }
        return Pair(expirationDate, null)
    }

    private fun requestCreateMeasurement(basetime: Date, baseTimeType: MeasurementBaseTimeType, edgeUuid: String, protected: Boolean = false) : Pair<String?, Exception?> {
        Log.d(TAG, "requestCreateMeasurement($basetime)")
        try {
            getEnableToken()
            var apiClient = ApiClient()
            apiClient.basePath = targetUrl + serverPath
            apiClient.setBearerToken(accessToken ?: "")
            var measCreate = MeasCreate()
            measCreate.basetime = basetime
            measCreate.basetimeType = baseTimeType
            measCreate.edgeUuid = edgeUuid
            measCreate.protected = protected
            var api = MeasMeasurementsApi(apiClient)
            var data = api.createMeasurement(measCreate)
            return Pair(data.uuid, null)
        }
        catch (e: Exception) {
            return Pair(null, e)
        }
    }

    /**
     * 指定した計測のステータスを完了状態にします。
     */
    private fun requestCompleteMeasurement(measurementUuid: String) : Exception? {
        Log.d(TAG, "requestCompleteMeasurement($measurementUuid)")
        try {
            getEnableToken()
            var apiClient = ApiClient()
            apiClient.basePath = targetUrl + serverPath
            apiClient.setBearerToken(accessToken ?: "")
            var api = MeasMeasurementsApi(apiClient)
            var data = api.completeMeasurement(measurementUuid.lowercase())
            return null
        }
        catch (e: Exception) {
            return e
        }
    }

    /**
     * 登録された計測のシーケンス情報を更新します。
     */
    private fun requestUpdateMeasurementSequence(sequencesUuid: String, measurementUuid: String, expectedDataPoints: Long, finalSequenceNumber: Long) : Exception? {
        Log.d(TAG, "requestUpdateMeasurementSequence(sequencesUuid: $sequencesUuid, expectedDataPoints: $expectedDataPoints, finalSequenceNumber: $finalSequenceNumber)")
        try {
            requestAccessToken()
            var apiClient = ApiClient()
            apiClient.basePath = targetUrl + serverPath
            apiClient.setBearerToken(accessToken ?: "")
            var replace = MeasurementSequenceGroupReplace()
            replace.expectedDataPoints = expectedDataPoints
            replace.finalSequenceNumber = finalSequenceNumber
            var api = MeasMeasurementsApi(apiClient)
            var data = api.updateMeasurementSequence(
                measurementUuid.lowercase(),
                sequencesUuid,
                replace)
            return null
        }
        catch (e: Exception) {
            return e
        }
    }

    /**
     * 指定した計測のステータスを送信完了状態にします。
     *
     * この状態は改修されていないデータがエッジに残っている状態です。
     *
     * 完全に回収が完了した状態は `RequestCompleteMeasurement` を利用します。
     */
    private fun requestEndMeasurement(measurementUuid: String) : Exception? {
        Log.d(TAG, "requestEndMeasurement(measurementUuid: $measurementUuid)")

        try {
            getEnableToken()
            var apiClient = ApiClient()
            apiClient.basePath = targetUrl + serverPath
            apiClient.setBearerToken(accessToken ?: "")
            var api = MeasMeasurementsApi(apiClient)
            var data = api.endMeasurement(measurementUuid.lowercase())
            return null
        }
        catch (e: Exception) {
            return e
        }
    }

    //endregion
}