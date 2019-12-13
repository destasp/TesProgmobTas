package com.example.tugasakhirsem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignIn = findViewById(R.id.btnDosen) as Button
        btnSignIn.setOnClickListener {
            val intent = Intent(this@MainActivity, CreateDosenActivity::class.java)
            startActivity(intent)
        }

    }
    }

