package com.example.daggerprac1

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    fun setListener(car: Car){
        Log.d("Car", "Remote is initialized")
    }
}