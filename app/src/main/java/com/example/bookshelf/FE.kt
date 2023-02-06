package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FE : AppCompatActivity() {

    private lateinit var btn_sem1: Button
    private lateinit var btn_sem2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fe)

        btn_sem1 = findViewById(R.id.btn_sem1)
        btn_sem2 = findViewById(R.id.btn_sem2)


        btn_sem1.setOnClickListener {
            val intent = Intent(this, sem1Books::class.java)
            startActivity(intent)
        }

        btn_sem2.setOnClickListener {
            val intent = Intent(this, sem2Books::class.java)
            startActivity(intent)
        }

    }
}