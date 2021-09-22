package com.hammerpath.audiosnapshot

import android.os.Handler
import android.os.ResultReceiver
import android.os.Bundle




class CustomResultReceiver(handler: Handler, private val appReceiver: AppReceiver) : ResultReceiver(handler) {

    override fun onReceiveResult(resultCode: Int, resultData: Bundle?) {
        if(appReceiver != null){
            appReceiver.onReceiveResult(resultCode, resultData)
        }
    }

    interface AppReceiver {
        fun onReceiveResult(resultCode: Int, resultData: Bundle?)
    }
}