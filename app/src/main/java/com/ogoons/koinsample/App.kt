package com.ogoons.koinsample

import android.app.Application
import com.ogoons.koinsample.di.appModules
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, appModules)

    }

}