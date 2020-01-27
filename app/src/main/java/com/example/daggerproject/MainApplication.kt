package com.example.daggerproject

import android.app.Application
import com.example.daggerproject.di.AppComponent
import com.example.daggerproject.di.DaggerAppComponent

class MainApplication : Application () {
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
        component.inject(this)
    }
}