package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeFiveActivity : AppCompatActivity() {
    lateinit var btCaps:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_five)
        btCaps=findViewById(R.id.btCaps)
        btCaps.setOnClickListener {
            var intent=Intent(this,MemeFourActivity::class.java)
            startActivity(intent)
        }
    }
}