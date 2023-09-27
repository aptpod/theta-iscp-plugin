package com.aptpod.theta.plugin.iscpstreaming

import com.aptpod.theta.plugin.iscpstreaming.helpers.ApplicationSettings

fun MainActivity.iscpConnect(intdash: ApplicationSettings.Intdash) {
    iscp.targetUrl = intdash.serverUrl
    iscp.serverPath = intdash.serverPath
    iscp.nodeId = intdash.nodeClientId
    iscp.nodeSecret = intdash.nodeClientSecretId
    iscp.saveToServer = intdash.saveToServer
    iscp.connect()
}

fun MainActivity.iscpClose() {
    iscp.close()
}