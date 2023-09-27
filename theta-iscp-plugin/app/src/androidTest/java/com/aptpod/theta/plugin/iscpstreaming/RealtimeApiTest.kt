package com.aptpod.theta.plugin.iscpstreaming

import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import com.aptpod.ApiClient
import com.aptpod.intdash.AuthOAuth2Api
import com.aptpod.iscp.connection.Connection
import com.aptpod.iscp.model.DataId
import com.aptpod.iscp.model.DataPoint
import com.aptpod.iscp.transport.WebSocketConfig

import java.util.Date
import java.util.UUID

@RunWith(AndroidJUnit4::class)
class RealtimeApiTest {

    companion object {
        const val URL_API = "https://example.intdash.jp"
        const val ADDRESS = "example.intdash.jp"
        const val NODE_ID = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"
        const val NODE_SECRET = "xxxxxxxxxx"
    }

    @Test
    fun invoke() {
        var tokenSource: () -> String = {
            var apiClient = ApiClient()
            apiClient.basePath = URL_API + "/api"
            var res = AuthOAuth2Api(apiClient).issueToken(
                "client_credentials",
                "", null, "", "",
                NODE_ID,
                NODE_SECRET,
                null, null, null, null)
            res.accessToken ?: ""
        }
        var (connection, connectionError) = Connection.connect(
            address = ADDRESS,
            transportConfig = WebSocketConfig(enableTls = true),
            tokenSource = tokenSource,
            nodeId = NODE_ID)
        if (connection == null) {
            println(connectionError)
            return
        }

        try {
            var sessionId = UUID.randomUUID().toString()
            var baseTime = Date().time * 1000000

            var (upstream, upstreamError) = connection.openUpstream(sessionId)
            if (upstream == null) {
                println(upstreamError)
                return
            }

            try {
                for (i in 0 until 10) {
                    Thread.sleep(1 * 1000)

                    var now = Date().time * 1000000
                    upstream.writeDataPoint(
                        dataId = DataId(
                            name = "greeting",
                            type = "string"
                        ),
                        dataPoint = DataPoint(
                            elapsedTime = now - baseTime,
                            payload = "hello".toByteArray(Charsets.UTF_8)
                        )
                    )
                }
            } finally {
                upstream.close()
            }
        } finally {
            connection.close()
        }
    }
}