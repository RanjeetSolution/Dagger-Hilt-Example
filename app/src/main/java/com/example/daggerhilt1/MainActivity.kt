package com.example.daggerhilt1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.daggerhilt1.demo.Car
import com.example.daggerhilt1.demo.Main
import com.example.daggerhilt1.demo.Main2
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var main: Main
    @Inject
    lateinit var main2: Main2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        car.getCar()
//        main.getName()
        main2.getName()

    }
}