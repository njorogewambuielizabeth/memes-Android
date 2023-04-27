package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemeFourActivity : AppCompatActivity() {
    lateinit var btN:Button
    lateinit var btP:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme_four)
        btN=findViewById(R.id.btN)
        btN.setOnClickListener {
            var intent= Intent(this,MemeFiveActivity::class.java)
            startActivity(intent)
        }
        btP=findViewById(R.id.btP)
        btP.setOnClickListener {
            var intent= Intent(this,MemeThreeActivity::class.java)
            startActivity(intent)
        }
    }
}