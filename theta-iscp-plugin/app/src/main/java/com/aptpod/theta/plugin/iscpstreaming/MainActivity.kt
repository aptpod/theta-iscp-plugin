package com.aptpod.theta.plugin.iscpstreaming

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.opengl.GLSurfaceView
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.KeyEvent
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import com.aptpod.theta.plugin.iscpstreaming.helpers.ApplicationSettings
import com.aptpod.theta.plugin.iscpstreaming.helpers.MySystemClock
import com.aptpod.theta.plugin.iscpstreaming.iscp.IscpConnection
import com.aptpod.theta.plugin.iscpstreaming.media.SurfaceViewRenderer
import com.aptpod.theta.plugin.iscpstreaming.media.TextureMovieEncoder
import com.theta360.pluginlibrary.activity.PluginActivity
import com.theta360.pluginlibrary.callback.KeyCallback
import com.theta360.pluginlibrary.factory.Camera
import com.theta360.pluginlibrary.receiver.KeyReceiver

class MainActivity : PluginActivity() {

    companion object {
        const val TAG = "MainActivity"

        val PERMISSIONS = arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
    }

    //region Video

    var cameraId = 0
    var mCamera: Camera? = null
    var exUnit: ByteArray? = null
    lateinit var mCameraHandler: CameraHandler
    lateinit var glView: GLSurfaceView
    var mRenderer: SurfaceViewRenderer? = null
    val mVideoEncoder = TextureMovieEncoder()
    lateinit var resolutionTextView: TextView

    //endregion

    //region iSCP

    val iscp = IscpConnection()
    val clock = MySystemClock.Shared
    var isRecording = false

    //endregion

    lateinit var applicationSettings: ApplicationSettings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate()")
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        changeStartupLED()
        applicationSettings = ApplicationSettings.load()
        setupCamera()
        setupAudio()
        notificationCameraClose()
        changeReadyLED()

        setKeyCallback(object : KeyCallback {
            override fun onKeyDown(p0: Int, p1: KeyEvent) {}
            override fun onKeyUp(p0: Int, p1: KeyEvent) {
                Log.d(TAG, "onKeyUp($p0) - KeyCallback")
                if (p0 == KeyReceiver.KEYCODE_CAMERA) {
                    Thread {
                        if (!isRecording) {
                            startMeasurement()
                        } else {
                            stopMeasurement()
                        }
                    }.start()
                }
            }
            override fun onKeyLongPress(p0: Int, p1: KeyEvent) {}
        })
    }

    fun startMeasurement() {
        Log.d(TAG, "startMeasurement()")
        isRecording = true
        try {
            if (applicationSettings.intdash == null) throw Exception("intdash settings not found.")
            iscpConnect(applicationSettings.intdash!!)
            // Video
            applicationSettings.video?.let { video ->
                startVideoStreaming(video)
            }
            // Audio
            applicationSettings.audio?.let { audio ->
                startAudioStreaming(audio)
            }
            notificationAudioMovStart() // Play the start sound.
            changeStreamingLED()
        } catch (e: Exception) {
            Log.e(TAG, "startMeasurement error. $e")
            isRecording = false
            playPPPSoundWithAppClose()
        }
    }

    fun stopMeasurement() {
        Log.d(TAG, "stopMeasurement()")
        isRecording = false
        try {
            iscpClose()
            stopVideoStreaming()
            stopAudioStreaming()
            notificationAudioMovStop() // Play the stop sound.
            changeReadyLED()
        } catch (e: Exception) {
            Log.e(TAG, "startMeasurement error. $e")
            playPPPSoundWithAppClose()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
        if (checkPermissions(PERMISSIONS)) {
            if (mCamera == null) return
            var resolution = applicationSettings.video?.resolution ?: DEFAULT_RESOLUTION
            openCamera(resolution)
            glView.queueEvent {
                mRenderer!!.setCameraPreviewSize(
                    resolution.width,
                    resolution.height
                )
            }
            resolutionTextView.text = "${resolution.width}x${resolution.height}"
        } else {
            ActivityCompat.requestPermissions(this, PERMISSIONS, 1)
        }
        glView.onResume()
    }

    fun checkPermissions(permissions: Array<String>) : Boolean {
        for (permission in permissions) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                return false
            }
        }
        return true
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            Toast.makeText(
                this,
                "Camera permission is needed to run this application", Toast.LENGTH_LONG
            ).show()
            val intent = Intent()
            intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
            intent.data = Uri.fromParts("package", this.packageName, null)
            this.startActivity(intent)
            finish()
        } else {
            if (mCamera == null) return
            ApplicationSettings.load().video?.let { video ->
                openCamera(video.resolution)
                glView.queueEvent {
                    mRenderer!!.setCameraPreviewSize(
                        video.resolution.width,
                        video.resolution.height
                    )
                }
                resolutionTextView.text = "${video.resolution.width}x${video.resolution.height}"
            }
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
        releaseCamera()
        glView.queueEvent { mRenderer!!.release() }
        glView.onPause()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy()")
        super.onDestroy()
        mCameraHandler.invalidateHandler()
        notificationCameraOpen()
        notificationSuccess()
    }
}