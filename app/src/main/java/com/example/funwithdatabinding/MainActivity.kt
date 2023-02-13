package com.example.funwithdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.funwithdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val btnPressMe = dataBinding.btnPressMe
        val tvHelloWorld = dataBinding.tvHelloWorld

        btnPressMe.setOnClickListener {
            tvHelloWorld.text = "Button Pressed!"
        }
    }
}