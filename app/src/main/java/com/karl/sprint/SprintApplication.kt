package com.karl.sprint

import android.app.Application
import com.karl.sprint.di.sprintModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SprintApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@SprintApplication)
            modules(sprintModule)
        }
    }

}