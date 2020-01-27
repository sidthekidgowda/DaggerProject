package com.example.daggerproject.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule(private val app: Application) {

    @Singleton
    @Provides
    fun providesApplication() : Application {
        return app
    }
}