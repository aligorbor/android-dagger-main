package com.example.android.dagger

import android.app.Application
import com.example.android.dagger.di.AppComponent
import com.example.android.dagger.di.DaggerAppComponent

open class MyApplication : Application() {

    val  appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}
