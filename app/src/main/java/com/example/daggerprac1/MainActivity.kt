package com.example.daggerprac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car: Car
    @Inject lateinit var wheels: Wheels
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.create()
        carComponent.mainInject(this)

        car.drive()
        wheels.drive()
    }
}