package com.aptpod.theta.plugin.iscpstreaming.helpers

import android.os.SystemClock
import java.util.Calendar
import java.util.Date

class MySystemClock {

    companion object {
        val Shared = MySystemClock()
    }

    var nowValue: Long = 0
        private set
        get() {
            return SystemClock.elapsedRealtimeNanos()
        }

    // RTC
    private var rtcBaseTime: Long = 0
    private var rtcBaseValue: Long = 0

    var rtcDate: Date = Date()
        private set
        get() {
            val t = SystemClock.elapsedRealtimeNanos() / 1000000
            val interval = t - (this.rtcBaseValue/1000000)
            return Date(this.rtcBaseTime+interval)
        }

    var rtcCalendar: Calendar = Calendar.getInstance()
        private set
        get() {
            val cal = Calendar.getInstance()
            cal.time = this.rtcDate
            return cal
        }

    var rtcUnixNanoTime: Long = 0
        private set
        get() {
            val t = SystemClock.elapsedRealtimeNanos()
            val interval = t - this.rtcBaseValue
            return (this.rtcBaseTime*1000000)+interval
        }

    fun resetRtc() {
        this.rtcBaseTime = System.currentTimeMillis()
        this.rtcBaseValue = SystemClock.elapsedRealtimeNanos()
    }

    // TODO: NTP

    init {
        val time = System.currentTimeMillis()
        val value = SystemClock.elapsedRealtimeNanos()
        // RTC
        this.rtcBaseTime = time
        this.rtcBaseValue = value
        // TODO: NTP
    }
}