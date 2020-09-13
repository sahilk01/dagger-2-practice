package com.example.daggerprac1

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor(private val nutBolts: NutBolts) {
    fun drive(){
        Log.d("Car", "wheels init hogye")
        nutBolts.add()
    }
}