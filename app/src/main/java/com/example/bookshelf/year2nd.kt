package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class year2nd : AppCompatActivity() {

    private lateinit var btn_sem3: Button
    private lateinit var btn_sem4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year2nd)

        btn_sem3 = findViewById(R.id.btn_sem3)
        btn_sem4 = findViewById(R.id.btn_sem4)

        btn_sem3.setOnClickListener {
            val intent = Intent(this, sem3Books::class.java)
            startActivity(intent)
        }

        btn_sem4.setOnClickListener {
            val intent = Intent(this, sem3Books::class.java)
            startActivity(intent)
        }
    }
}