package com.example.daggerprac1

import android.util.Log
import javax.inject.Inject

class NutBolts @Inject constructor() {
    fun add(){
        Log.d("Car", "nut bolts are added")
    }
}