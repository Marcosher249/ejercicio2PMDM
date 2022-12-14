package com.example.ejercicio2pmdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart= 1
    private var onResume = 2
    private var onPause= 3
    private var onRestart = 4
    private var onDestroy= 5


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")

    }
    override fun onStart() {
        super.onStart()
        println("onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause $onPause")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart $onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy $onDestroy")
    }


}