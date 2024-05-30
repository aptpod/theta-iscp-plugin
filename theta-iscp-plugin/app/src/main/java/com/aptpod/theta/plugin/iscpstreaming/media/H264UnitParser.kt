package com.aptpod.theta.plugin.iscpstreaming.media

import android.util.Log
import kotlin.experimental.and

interface OnH264UnitParserListener {
    fun didFoundIDRFrame(frame: ByteArray, timeStamp: Long)
    fun didFoundNoIDRFrame(frame: ByteArray, timeStamp: Long)
    fun didFoundExUnit(unit: ByteArray, timeStamp: Long)
}

class H264UnitParser {

    companion object {
        private const val TAG = "H264UnitParser"

        private const val NALU_TYPE_NON_IDR_PICTURE: Byte = 0x01
        private const val NALU_TYPE_IDR_PICTURE: Byte = 0x05
        private const val NALU_TYPE_SPS: Byte = 0x07
        private const val NALU_TYPE_PPS: Byte = 0x08

        private val NALU_TYPES_STRINGS = arrayListOf(
            "0: Unspecified (non-VCL)",
            "1: Coded slice of a non-IDR picture (VCL)",    // P frame
            "2: Coded slice data partition A (VCL)",
            "3: Coded slice data partition B (VCL)",
            "4: Coded slice data partition C (VCL)",
            "5: Coded slice of an IDR picture (VCL)",      // I frame
            "6: Supplemental enhancement information (SEI) (non-VCL)",
            "7: Sequence parameter set (non-VCL)",         // SPS parameter
            "8: Picture parameter set (non-VCL)",          // PPS parameter
            "9: Access unit delimiter (non-VCL)",
            "10: End of sequence (non-VCL)",
            "11: End of stream (non-VCL)",
            "12: Filler data (non-VCL)",
            "13: Sequence parameter set extension (non-VCL)",
            "14: Prefix NAL unit (non-VCL)",
            "15: Subset sequence parameter set (non-VCL)",
            "16: Reserved (non-VCL)",
            "17: Reserved (non-VCL)",
            "18: Reserved (non-VCL)",
            "19: Coded slice of an auxiliary coded picture without partitioning (non-VCL)",
            "20: Coded slice extension (non-VCL)",
            "21: Coded slice extension for depth view components (non-VCL)",
            "22: Reserved (non-VCL)",
            "23: Reserved (non-VCL)",
            "24: STAP-A Single-time aggregation packet (non-VCL)",
            "25: STAP-B Single-time aggregation packet (non-VCL)",
            "26: MTAP16 Multi-time aggregation packet (non-VCL)",
            "27: MTAP24 Multi-time aggregation packet (non-VCL)",
            "28: FU-A Fragmentation unit (non-VCL)"
        )

        fun parse(frameData: ByteArray, listener: OnH264UnitParserListener, timeStamp: Long) {
            var data = frameData
            var length = frameData.size

            if(!((data[0] == 0x00.toByte() && data[1] == 0x00.toByte() && data[2] == 0x00.toByte())
                        || (data[0] == 0x00.toByte() && data[1] == 0x00.toByte() && data[2] == 0x00.toByte() && data[3] == 0x01.toByte()))){
                LogE("Not Supported Video Frame.")
                return
            }

            var idrFrame: ByteArray? = null
            var nonIdrFrame: ByteArray? = null
            var exUnit: ByteArray? = null

            var fIndex = 0
            var naluStart = 0
            var naluUnitLength = 0
            var startCodeLength = 0
            while ((fIndex+3) < length) {
                // Search NALU Type
                if(!( (data[fIndex] == 0x00.toByte() && data[fIndex+1] == 0x00.toByte() && data[fIndex+2] == 0x01.toByte())
                            || (data[fIndex] == 0x00.toByte() && data[fIndex+1] == 0x00.toByte() && data[fIndex+2] == 0x00.toByte() && data[fIndex+3] == 0x01.toByte()) ) ){
                    fIndex += 1
                    continue
                }
                naluUnitLength = fIndex - naluStart
                startCodeLength = 0
                if((data[fIndex] == 0x00.toByte() && data[fIndex+1] == 0x00.toByte() && data[fIndex+2] == 0x01.toByte())) {
                    startCodeLength = 3
                } else if ((data[fIndex] == 0x00.toByte() && data[fIndex+1] == 0x00.toByte() && data[fIndex+2] == 0x00.toByte() && data[fIndex+3] == 0x01.toByte())) {
                    startCodeLength = 4
                }
                if(naluUnitLength != 0 && startCodeLength != 0){
                    val startIndex = naluStart + startCodeLength
                    val naluType = data[startIndex] and 0x1f
                    naluUnitLength -= startCodeLength
                    LogD(">>>>>>>>>>>>>>>> Packet Length:$length fIndex:$fIndex Packet[$startIndex] NALU Type ${NALU_TYPES_STRINGS[naluType.toInt()]}")
                    when(naluType) {
                        NALU_TYPE_SPS -> {
                            val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                            if(exUnit != null){
                                exUnit += buf
                            }else{
                                exUnit = buf
                            }
                        }
                        NALU_TYPE_PPS -> {
                            val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                            if(exUnit != null){
                                exUnit += buf
                            }else{
                                exUnit = buf
                            }
                        }
                        NALU_TYPE_IDR_PICTURE -> {
                            val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                            if(idrFrame != null){
                                idrFrame += buf
                            }else{
                                idrFrame = buf
                            }
                        }
                        NALU_TYPE_NON_IDR_PICTURE -> {
                            val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                            if(nonIdrFrame != null){
                                nonIdrFrame += buf
                            }else{
                                nonIdrFrame = buf
                            }
                        }
                        else -> {
                            LogD("Not Supported NALU Packet.")
                        }
                    }
                }
                naluStart = fIndex
                fIndex += startCodeLength
            }

            naluUnitLength = data.size - naluStart
            startCodeLength = 0
            if((data[naluStart] == 0x00.toByte() && data[naluStart+1] == 0x00.toByte() && data[naluStart+2] == 0x01.toByte())) {
                startCodeLength = 3
            } else if ((data[naluStart] == 0x00.toByte() && data[naluStart+1] == 0x00.toByte() && data[naluStart+2] == 0x00.toByte() && data[naluStart+3] == 0x01.toByte())) {
                startCodeLength = 4
            }
            val startIndex = naluStart+startCodeLength
            val naluType = data[startIndex] and 0x1f
            naluUnitLength -= startCodeLength
            LogD(">>>>>>>>>>>>>>>> Packet Length:$length fIndex:$fIndex Packet[$startIndex] NALU Type ${NALU_TYPES_STRINGS[naluType.toInt()]}")
            when(naluType) {
                NALU_TYPE_SPS -> {
                    val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                    if(exUnit != null){
                        exUnit += buf
                    }else{
                        exUnit = buf
                    }
                }
                NALU_TYPE_PPS -> {
                    val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                    if(exUnit != null){
                        exUnit += buf
                    }else{
                        exUnit = buf
                    }
                }
                NALU_TYPE_IDR_PICTURE -> {
                    val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                    if(idrFrame != null){
                        idrFrame += buf
                    }else{
                        idrFrame = buf
                    }
                }
                NALU_TYPE_NON_IDR_PICTURE -> {
                    val buf = data.sliceArray(naluStart until (naluStart+startCodeLength+naluUnitLength))
                    if(nonIdrFrame != null){
                        nonIdrFrame += buf
                    }else{
                        nonIdrFrame = buf
                    }
                }
                else -> {
                    LogD("Not Supported NALU Packet.")
                }
            }

            if (exUnit != null) {
                listener.didFoundExUnit(exUnit, timeStamp)
            }
            if (idrFrame != null) {
                listener.didFoundIDRFrame(idrFrame, timeStamp)
            }
            if (nonIdrFrame != null) {
                listener.didFoundNoIDRFrame(nonIdrFrame, timeStamp)
            }
        }


        private fun LogD(message: String) {
            Log.d(TAG, message)
        }

        private fun LogE(message: String) {
            Log.e(TAG, message)
        }

        private fun LogW(message: String) {
            Log.w(TAG,message)
        }
    }

    enum class DataType(val type: Int) {
        IDRFrame(0),
        NonIDRFrame(1),
        ExUnit(8)
    }
}