package com.example.hellocodepath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.HelloBTN)
        btn.setOnClickListener {
            Log.v("Hello World", "Button clicked")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_LONG).show()
        }
    }
}