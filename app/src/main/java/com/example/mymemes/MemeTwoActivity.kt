package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeTwoActivity : AppCompatActivity() {
    lateinit var btNextOne:Button
    lateinit var btBac:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_two)
        btNextOne=findViewById(R.id.btNextOne)
        btNextOne.setOnClickListener {
            var intent=Intent(this,MemeThreeActivity::class.java)
            startActivity(intent)
        }
        btBac=findViewById(R.id.btBac)
        btBac.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}