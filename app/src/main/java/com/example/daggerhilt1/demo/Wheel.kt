package com.example.daggerhilt1.demo

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {

    fun getWheel(){
        Log.d("Main", "Wheel Started....")
    }
}