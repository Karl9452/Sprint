package com.karl.sprint

import android.app.Application
import org.koin.core.context.startKoin

class SprintApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {

        }
    }

}