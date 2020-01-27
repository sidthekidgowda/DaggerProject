package com.example.daggerproject.di

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    @Named("Hello World")
    fun provideHelloWorld() : String {
        return "Hello DaggerProject"
    }
}