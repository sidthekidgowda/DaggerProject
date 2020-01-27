package com.example.daggerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerproject.di.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit @field:Named("Hello World") var helloWorld: String

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MainApplication).component.activityComponent(ActivityModule(this)).inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text_view.text = helloWorld
    }
}
