package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sem : AppCompatActivity() {

    private lateinit var btnToLogin: Button
    private lateinit var btn_sem1: Button
    private lateinit var btn_sem2: Button
    private lateinit var btn_sem3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem)

        btn_sem1 = findViewById(R.id.btn_sem1)
        btn_sem2 = findViewById(R.id.btn_sem2)
        btn_sem3 = findViewById(R.id.btn_sem3)


        btn_sem1 = findViewById(R.id.btn_sem1)
        btn_sem2 = findViewById(R.id.btn_sem2)
        btn_sem3 = findViewById(R.id.btn_sem3)

        btnToLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        btn_sem1.setOnClickListener {
            val intent = Intent(this, sem1Books::class.java)
            startActivity(intent)
        }

        btn_sem2.setOnClickListener {
            val intent = Intent(this, sem2Books::class.java)
            startActivity(intent)
        }

        btn_sem3.setOnClickListener {
            val intent = Intent(this, sem3Books::class.java)
            startActivity(intent)
        }


    }
}