package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeThreeActivity : AppCompatActivity() {
    lateinit var btNextThree: Button
    lateinit var btBa:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_three)
        btNextThree = findViewById(R.id.btNextThree)
        btNextThree.setOnClickListener {
            var intent=Intent(this,MemeFourActivity::class.java)
            startActivity(intent)
        }
        btBa = findViewById(R.id.btBa)
        btBa.setOnClickListener {
            var intent=Intent(this,MemeTwoActivity::class.java)
            startActivity(intent)
        }
    }
}