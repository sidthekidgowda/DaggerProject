package com.example.daggerproject.di

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: Application)

    fun activityComponent(actModule: ActivityModule) : ActivityComponent
}