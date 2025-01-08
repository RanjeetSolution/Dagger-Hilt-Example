package com.example.daggerhilt1.demo

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(){

    fun getEngine(){
        Log.d("Main", "Engine Started")
    }
}