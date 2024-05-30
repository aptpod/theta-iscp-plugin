package com.aptpod.theta.plugin.iscpstreaming.iscp

import java.nio.ByteBuffer

class PCMPayload(
    val formatId: UShort,
    val channels: UShort,
    val sampleRate: UInt,
    val bitsPerSample: UShort,
    var data: ByteArray = ByteArray(0)
) {

    fun encode() : ByteArray {
        var data = ByteArray(0)
        data += this.formatId.toByteArray()
        data += this.channels.toByteArray()
        data += this.sampleRate.toByteArray()
        data += this.bitsPerSample.toByteArray()
        data += this.data
        return data
    }
}

private fun UInt.toByteArray(): ByteArray {
    val value = this.toInt()
    val bytes = ByteArray(4)
    bytes[0] = (value and 0xFF).toByte()
    bytes[1] = ((value ushr 8) and 0xFF).toByte()
    bytes[2] = ((value ushr 16) and 0xFF).toByte()
    bytes[3] = ((value ushr 24) and 0xFF).toByte()
    return bytes
}
private fun UShort.toByteArray(): ByteArray {
    val value = this.toInt()
    val bytes = ByteArray(2)
    bytes[0] = (value and 0xFF).toByte()
    bytes[1] = ((value ushr 8) and 0xFF).toByte()
    return bytes
}
