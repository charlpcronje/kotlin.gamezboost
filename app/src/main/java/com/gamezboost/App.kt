package com.gamezboost

import android.app.Application
import android.content.Context
import android.widget.Toast

class App : Application() {
    init {
        INSTANCE = this
    }

    val data : Data = Data()
    val toast : Toast? = null

    companion object {
        lateinit var INSTANCE: App
            private set

        val applicationContext: Context get() {
            return INSTANCE.applicationContext
        }
    }


}