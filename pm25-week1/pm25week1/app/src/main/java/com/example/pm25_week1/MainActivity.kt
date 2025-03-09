package com.example.pm25_week1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnSayHello = findViewById<Button>(R.id.btnSayHello)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)

        btnSayHello.setOnClickListener {
            val name = etName.text.toString().trim()
            tvMessage.text = "Hello, $name"
        }
    }
}