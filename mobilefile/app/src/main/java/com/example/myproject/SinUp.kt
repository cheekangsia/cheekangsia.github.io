package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SinUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sin_up)

        val buttonClick = findViewById<Button>(R.id.button_done)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)

        }
    }
}