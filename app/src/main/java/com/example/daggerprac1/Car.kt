package com.example.daggerprac1

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {
    fun drive(){
        Log.d(TAG, "Car initialize hogya")
        engine.drive()
        wheels.drive()
    }
}