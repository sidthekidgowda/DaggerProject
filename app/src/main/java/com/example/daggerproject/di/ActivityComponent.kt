package com.example.daggerproject.di

import com.example.daggerproject.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)

}