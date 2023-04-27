package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btNext = findViewById(R.id.btNext)
        btNext.setOnClickListener {
            var intent = Intent(this, MemeTwoActivity::class.java)
            startActivity(intent)
        }


    }
}