package com.example.daggerprac1

import android.util.Log
import javax.inject.Inject

class Wheels(private val rims: Rims, private val tires: Tires) {
    fun drive(){
        Log.d("Car", "wheels init hogye")
        tires.inflate()
    }
}