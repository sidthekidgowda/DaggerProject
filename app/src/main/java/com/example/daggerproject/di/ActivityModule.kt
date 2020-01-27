package com.example.daggerproject.di

import androidx.fragment.app.FragmentActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity : FragmentActivity) {

    @Provides
    fun providesActivity() : FragmentActivity {
        return activity
    }
}