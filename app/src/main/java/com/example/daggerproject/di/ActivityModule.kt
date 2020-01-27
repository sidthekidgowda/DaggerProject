package com.example.daggerproject.di

import androidx.fragment.app.FragmentActivity
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ActivityModule(private val activity : FragmentActivity) {

    @Provides
    fun providesActivity() : FragmentActivity {
        return activity
    }

    @Provides
    @Named("Hello World")
    fun provideHelloWorld() : String {
        return "Hello DaggerProject"
    }
}