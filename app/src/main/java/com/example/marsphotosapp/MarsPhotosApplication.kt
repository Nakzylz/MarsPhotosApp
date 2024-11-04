package com.example.marsphotosapp

import android.app.Application
import com.example.marsphotosapp.data.AppContainer
import com.example.marsphotosapp.data.DefaultAppContainer

class MarsPhotosApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}