package com.aptpod.theta.plugin.iscpstreaming

import android.graphics.SurfaceTexture
import android.opengl.GLSurfaceView
import android.os.Handler
import android.os.Message
import android.util.Log
import android.util.Size
import com.aptpod.iscp.helpers.DispatchQueue
import com.aptpod.iscp.model.DataId
import com.aptpod.iscp.model.DataPoint
import com.aptpod.theta.plugin.iscpstreaming.MainActivity.Companion.TAG
import com.aptpod.theta.plugin.iscpstreaming.helpers.ApplicationSettings
import com.aptpod.theta.plugin.iscpstreaming.iscp.H264Payload
import com.aptpod.theta.plugin.iscpstreaming.iscp.IscpConnection
import com.aptpod.theta.plugin.iscpstreaming.media.H264UnitParser
import com.aptpod.theta.plugin.iscpstreaming.media.OnH264UnitParserListener
import com.aptpod.theta.plugin.iscpstreaming.media.SurfaceViewRenderer
import com.aptpod.theta.plugin.iscpstreaming.media.VideoEncoderCore
import com.theta360.pluginlibrary.exif.CameraSettings
import com.theta360.pluginlibrary.factory.FactoryBase
import com.theta360.pluginlibrary.values.ThetaModel
import java.lang.ref.WeakReference

val DEFAULT_RESOLUTION: Size = Size(1920, 960)

fun MainActivity.setupCamera() {
    var factory = FactoryBase()
    //THETA X
    if (ThetaModel.isXModel()) {
        Log.d(TAG, "Theta X Found")
        mCamera = factory.abstractCamera(FactoryBase.CameraModel.XCamera)
    }
    //THETA V and THETA Z1
    if (ThetaModel.isVCameraModel()) {
        Log.d(TAG, "Theta V or Z1 Found")
        mCamera = factory.abstractCamera(FactoryBase.CameraModel.VCamera)
    }
    if (mCamera == null) {
        throw java.lang.RuntimeException("Not supported device.")
    }

    mCameraHandler = CameraHandler(this)
    glView = findViewById(R.id.main_glSurfaceView)
    glView.setEGLContextClientVersion(2)
    mRenderer = SurfaceViewRenderer(mCameraHandler, mVideoEncoder)
    glView.setRenderer(mRenderer)
    glView.renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
    resolutionTextView = findViewById(R.id.main_resolutionText)

    mVideoEncoder.videoEncodeListener = object : VideoEncoderCore.VideoEncodeListener {
        override fun onOutput(encodedData: ByteArray, presentationTimeUs: Long) {
            Log.d(TAG, "onOutput(${encodedData.size} bytes, presentationTimeUs: $presentationTimeUs) - VideoEncoderCore.VideoEncodeListener")
            if (iscp.baseTime == null) return
            var nanos = presentationTimeUs * 1000 // Us to NS
            var timestamp = nanos - iscp.baseTime!!
            DispatchQueue.Global.async {
                H264UnitParser.parse(encodedData, object : OnH264UnitParserListener {
                    override fun didFoundIDRFrame(frame: ByteArray, timeStamp: Long) {
                        Log.d(TAG, "didFoundIDRFrame(${frame.size} bytes) - OnH264UnitParserListener")
                        exUnit?.let { unit ->
                            // H.264 format payload generation for iSCP.
                            var dataId = DataId(
                                "v1/${IscpConnection.DATA_POINT_CHANNEL}/${"%02x".format(H264UnitParser.DataType.ExUnit.type)}",
                                "h264_annex_b")
                            var payload = H264Payload(unit).encode()
                            var dataPoint = DataPoint(timestamp, payload)
                            iscp.upstream?.writeDataPoint(dataId, dataPoint)
                        }
                        // H.264 format payload generation for iSCP.
                        var dataId = DataId("v1/${IscpConnection.DATA_POINT_CHANNEL}/${"%02x".format(
                            H264UnitParser.DataType.IDRFrame.type)}",
                            "h264_annex_b")
                        var payload = H264Payload(frame).encode()
                        var dataPoint = DataPoint(timestamp, payload)
                        iscp.upstream?.writeDataPoint(dataId, dataPoint)
                    }

                    override fun didFoundNoIDRFrame(frame: ByteArray, timeStamp: Long) {
                        Log.d(TAG, "didFoundNoIDRFrame(${frame.size} bytes) - OnH264UnitParserListener")
                        // H.264 format payload generation for iSCP.
                        var dataId = DataId(
                            "v1/${IscpConnection.DATA_POINT_CHANNEL}/${"%02x".format(H264UnitParser.DataType.NonIDRFrame.type)}",
                            "h264_annex_b"
                        )
                        var payload = H264Payload(frame).encode()
                        var dataPoint = DataPoint(timestamp, payload)
                        iscp.upstream?.writeDataPoint(dataId, dataPoint)
                    }

                    override fun didFoundExUnit(unit: ByteArray, timeStamp: Long) {
                        Log.d(TAG, "didFoundExUnit(${unit.size} bytes) - OnH264UnitParserListener")
                        exUnit = unit
                    }
                }, timestamp)
            }
        }
    }
}

fun MainActivity.startVideoStreaming(video: ApplicationSettings.Video) {
    if (video.enabled) {
        Log.d(TAG, "startVideoStreaming()")
        mVideoEncoder.bitRate = video.bitRate
        mVideoEncoder.sampleRate = video.sampleRate
        mVideoEncoder.encodeRate = video.encodeRate
        mVideoEncoder.iFrameInterval = video.iFrameInterval
        mRenderer?.changeRecordingState(true)
    }
}

fun MainActivity.stopVideoStreaming() {
    Log.d(TAG, "stopVideoStreaming()")
    mRenderer?.changeRecordingState(false)
}

fun MainActivity.openCamera(resolution: Size) {
    Log.d(TAG, "openCamera(resolution: ${resolution.width}x${resolution.height})")
    //THETA X
    if (ThetaModel.isXModel()) {
        cameraId = theta360.hardware.Camera.CameraInfo.CAMERA_FACING_DOUBLE
        mCamera?.open(this, cameraId)
    }
    //THETA V and Z1
    if (ThetaModel.isVCameraModel()) {
        cameraId = android.hardware.Camera.CameraInfo.CAMERA_FACING_BACK
        mCamera?.open(cameraId)
    }
    /**
     * Initialize CameraSettings for Metadata
     */
    CameraSettings.initialize()
    var parameters = mCamera!!.parameters
    parameters["RIC_PROC_STITCHING"] = "RicStaticStitching"
    parameters.set("RIC_SHOOTING_MODE", "RicStillPreview${resolution.width}")
    parameters.setPreviewSize(resolution.width, resolution.height)
    Log.d(TAG, "setParameters()")
    mCamera?.setParameters()
}

fun MainActivity.releaseCamera() {
    mCamera?.stopPreview()
    mCamera?.release()
    mCamera = null
}

class CameraHandler(activity: MainActivity) : Handler() {
    private val mWeakActivity: WeakReference<MainActivity>
    fun invalidateHandler() {
        mWeakActivity.clear()
    }

    override fun handleMessage(inputMessage: Message) {
        val what = inputMessage.what
        val activity = mWeakActivity.get() ?: return
        when (what) {
            SurfaceViewRenderer.MSG_SET_SURFACE_TEXTURE -> activity.handleSetSurfaceTexture(inputMessage.obj as SurfaceTexture)
            else -> throw RuntimeException("unknown msg $what")
        }
    }

    init {
        mWeakActivity = WeakReference(activity)
    }
}

fun MainActivity.handleSetSurfaceTexture(st: SurfaceTexture) {
    st.setOnFrameAvailableListener(object : SurfaceTexture.OnFrameAvailableListener {
        override fun onFrameAvailable(p0: SurfaceTexture?) {
            glView.requestRender()
        }
    })
    mCamera?.setPreviewTexture(st)
    mCamera?.startPreview()
}