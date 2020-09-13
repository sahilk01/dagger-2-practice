package com.example.daggerprac1

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {
    fun drive(){
        Log.d("Car", "Engine init hogya")
    }
}