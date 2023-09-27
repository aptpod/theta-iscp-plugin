package com.aptpod.theta.plugin.iscpstreaming.helpers

import android.util.Log
import android.util.Size
import org.json.JSONObject
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader

class ApplicationSettings {

    companion object {
        const val TAG = "ApplicationSettings"

        const val FILE_PATH = "/storage/self/primary/iscp_plugin_settings.json"

        const val KEY_INTDASH = "intdash"
        const val KEY_VIDEO = "video"
        const val KEY_AUDIO = "audio"

        fun load() : ApplicationSettings {
            var settings = ApplicationSettings()
            var reader: BufferedReader? = null
            try {
                reader = BufferedReader(InputStreamReader(FileInputStream(FILE_PATH)))
                var jsonStr = reader.readText()
                //Log.d(TAG, "load settings json: $jsonStr")
                var jsonObj = JSONObject(jsonStr)
                if(jsonObj.has(KEY_INTDASH)) settings.intdash = Intdash.parse(jsonObj.getJSONObject(KEY_INTDASH))
                if(jsonObj.has(KEY_VIDEO)) settings.video = Video.parse(jsonObj.getJSONObject(KEY_VIDEO))
                if(jsonObj.has(KEY_AUDIO)) settings.audio = Audio.parse(jsonObj.getJSONObject(KEY_AUDIO))
                return settings
            } catch (e: Exception) {
                Log.e(TAG, "load application settings error. $e")
            } finally {
                try { reader?.close() } catch (e: Exception) { e.printStackTrace() }
            }
            return settings
        }
    }

    private constructor()

    //region intdash

    class Intdash {

        companion object {
            const val KEY_INTDASH_SERVER_URL = "server_url"
            const val KEY_INTDASH_SERVER_PATH = "/api"
            const val KEY_INTDASH_NODE_CLIENT_ID = "node_client_id"
            const val KEY_INTDASH_NODE_CLIENT_SECRET = "node_client_secret"
            const val KEY_INTDASH_SAVE_TO_SERVER = "save_to_server"

            fun parse(json: JSONObject) : Intdash {
                var model = Intdash()
                model.serverUrl = json.getString(KEY_INTDASH_SERVER_URL)
                if (json.has(KEY_INTDASH_SERVER_PATH)) model.serverPath = json.getString(
                    KEY_INTDASH_SERVER_PATH)
                model.nodeClientId = json.getString(KEY_INTDASH_NODE_CLIENT_ID)
                model.nodeClientSecretId = json.getString(KEY_INTDASH_NODE_CLIENT_SECRET)
                if (json.has(KEY_INTDASH_SAVE_TO_SERVER)) model.saveToServer = json.getBoolean(
                    KEY_INTDASH_SAVE_TO_SERVER)
                return model
            }
        }

        var serverUrl = ""
        var serverPath = "/api"
        var nodeClientId = ""
        var nodeClientSecretId = ""
        var saveToServer: Boolean = false
    }

    var intdash: Intdash? = null

    //endregion

    //region Video

    class Video {

        companion object {
            const val KEY_ENABLED = "enabled"
            const val KEY_RESOLUTION = "resolution"
            const val KEY_RESOLUTION_WIDTH = "width"
            const val KEY_RESOLUTION_HEIGHT = "height"
            const val KEY_SAMPLE_RATE = "sample_rate"
            const val KEY_ENCODE_RATE = "encode_rate"
            const val KEY_BIT_RATE = "bit_rate"
            const val KEY_I_FRAME_INTERVAL = "i_frame_interval"

            fun parse(json: JSONObject) : Video {
                var model = Video()
                model.enabled = json.getBoolean(KEY_ENABLED)
                var resolution = json.getJSONObject(KEY_RESOLUTION)
                model.resolution = Size(resolution.getInt(KEY_RESOLUTION_WIDTH), resolution.getInt(
                    KEY_RESOLUTION_HEIGHT))
                if (json.has(KEY_SAMPLE_RATE)) model.sampleRate = json.getDouble(KEY_SAMPLE_RATE).toFloat()
                if (json.has(KEY_SAMPLE_RATE)) model.encodeRate = json.getDouble(KEY_ENCODE_RATE).toFloat()
                if (json.has(KEY_BIT_RATE)) model.bitRate = json.getInt(KEY_BIT_RATE)
                if (json.has(KEY_I_FRAME_INTERVAL)) model.iFrameInterval = json.getInt(
                    KEY_I_FRAME_INTERVAL)
                return model
            }
        }

        var enabled: Boolean = false
        var resolution: Size = Size(1920, 960)
        var sampleRate: Float = 29.97f
        var encodeRate: Float = 29.97f
        var bitRate: Int = 2000000
        var iFrameInterval: Int = 2
    }

    var video: Video? = null

    //endregion

    //region Audio

    class Audio
    {
        companion object {
            const val KEY_ENABLED = "enabled"
            const val KEY_SAMPLE_RATE = "sample_rate"
            const val KEY_FRAME_SIZE = "frame_size"

            fun parse(json: JSONObject) : Audio {
                var model = Audio()
                model.enabled = json.getBoolean(KEY_ENABLED)
                if (json.has(KEY_SAMPLE_RATE)) model.sampleRate = json.getInt(KEY_SAMPLE_RATE)
                if (json.has(KEY_FRAME_SIZE)) model.frameSize = json.getInt(KEY_FRAME_SIZE)
                return model
            }
        }

        var enabled: Boolean = false
        var sampleRate: Int = 48000
        var frameSize: Int = 1024
    }

    var audio: Audio? = null

    //endregion
}