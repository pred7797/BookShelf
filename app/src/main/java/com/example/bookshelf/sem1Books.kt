package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sem1Books : AppCompatActivity() {

    private lateinit var btn_em1: Button
    private lateinit var btn_phy1: Button
    private lateinit var btn_chem1: Button
    private lateinit var btn_bee: Button
    private lateinit var btn_eg: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sem1_books)

        btn_em1 = findViewById(R.id.btn_em1)
        btn_phy1 = findViewById(R.id.btn_phy1)
        btn_chem1 = findViewById(R.id.btn_chem1)
        btn_bee = findViewById(R.id.btn_bee)
        btn_eg = findViewById(R.id.btn_eg)


        btn_phy1.setOnClickListener {
            val intent = Intent(this, phy1Book::class.java)
            startActivity(intent)
        }

        btn_em1.setOnClickListener {
            val intent = Intent(this, emBook::class.java)
            startActivity(intent)
        }

    }
}