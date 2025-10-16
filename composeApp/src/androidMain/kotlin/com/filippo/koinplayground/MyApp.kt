package com.filippo.koinplayground

import android.app.Application
import com.filippo.koinplayground.di.KoinApp
import org.koin.android.ext.koin.androidContext
import org.koin.ksp.generated.startKoin

class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        KoinApp.startKoin {
            androidContext(this@MyApp)
        }
    }
}
