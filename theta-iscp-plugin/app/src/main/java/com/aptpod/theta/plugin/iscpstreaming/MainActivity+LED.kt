package com.aptpod.theta.plugin.iscpstreaming

import com.theta360.pluginlibrary.values.LedColor
import com.theta360.pluginlibrary.values.LedTarget
import com.theta360.pluginlibrary.values.TextArea
import com.theta360.pluginlibrary.values.ThetaModel

fun MainActivity.changeStartupLED() {
    if (ThetaModel.isVCameraModel()) {
        if (ThetaModel.isZ1Model()) {
            notificationOledHide()
            val textMap: MutableMap<TextArea, String> = HashMap()
            textMap[TextArea.MIDDLE] = "Wireless Live Streaming"
            textMap[TextArea.BOTTOM] = ""
            notificationOledTextShow(textMap)
        } else {
            notificationLedHide(LedTarget.LED5) // Video
            notificationLedHide(LedTarget.LED6) // LIVE
            notificationLedHide(LedTarget.LED7) // Recording
            notificationLedHide(LedTarget.LED8) // Error
        }
    }
}

fun MainActivity.changeReadyLED() {
    if (ThetaModel.isVCameraModel()) {
        if (ThetaModel.isZ1Model()) {
            val textMap: MutableMap<TextArea, String> = HashMap()
            textMap[TextArea.MIDDLE] = "Wireless Live Streaming"
            textMap[TextArea.BOTTOM] = "STREAMING STANDBY"
            notificationOledTextShow(textMap)
        } else {
            notificationLedShow(LedTarget.LED5) // Video
            notificationLedShow(LedTarget.LED6) // LIVE
            notificationLedHide(LedTarget.LED7) // Recording
            notificationLedHide(LedTarget.LED8) // Error
        }
    }
}

fun MainActivity.changeStreamingLED() {
    if (ThetaModel.isVCameraModel()) {
        if (ThetaModel.isZ1Model()) {
            val textMap: MutableMap<TextArea, String> = HashMap()
            textMap[TextArea.MIDDLE] = "Wireless Live Streaming"
            textMap[TextArea.BOTTOM] = "STREAMING"
            notificationOledTextShow(textMap)
        } else {
            notificationLedShow(LedTarget.LED5) // Video
            notificationLedShow(LedTarget.LED6) // LIVE
            notificationLedBlink(LedTarget.LED7, LedColor.BLUE, 1000) // Recording
            notificationLedHide(LedTarget.LED8) // Error
        }
    }
}

fun MainActivity.changeErrorLED() {
    notificationLedShow(LedTarget.LED5); // Video
    notificationLedShow(LedTarget.LED6); // LIVE
    notificationLedHide(LedTarget.LED7); // Recording
    notificationLedBlink(LedTarget.LED8, LedColor.BLUE, 1000); // Error
}

fun MainActivity.changeEndLED() {
    if (ThetaModel.isVCameraModel()) {
        if (ThetaModel.isZ1Model()) {
            notificationOledHide()
        } else {
            notificationLedHide(LedTarget.LED5) // Video
            notificationLedHide(LedTarget.LED6) // LIVE
            notificationLedHide(LedTarget.LED7) // Recording
            notificationLedHide(LedTarget.LED8) // Error
        }
    }
}

fun MainActivity.playPPPSoundWithAppClose() {
    if (ThetaModel.isVCameraModel()) {
        if (ThetaModel.isZ1Model()) {
            notificationErrorOccured()
        } else {
            notificationAudioWarning()
        }
    }
    changeEndLED()
    finishAffinity()
}