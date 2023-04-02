package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Year : AppCompatActivity() {

    private lateinit var btnToLogin: Button
    private lateinit var Year1 : Button
    private lateinit var Year2: Button
    private lateinit var Year3: Button
    private lateinit var Year4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year)

        btnToLogin = findViewById(R.id.btnToLogin)
        Year1 = findViewById(R.id.Year1)
        Year2 = findViewById(R.id.Year2)
        Year3 = findViewById(R.id.Year3)
        Year4 = findViewById(R.id.Year4)

        btnToLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        Year1.setOnClickListener {
            val intent = Intent(this, year1st::class.java)
            startActivity(intent)
        }

        Year2.setOnClickListener {
            val intent = Intent(this, year2nd::class.java)
            startActivity(intent)
        }

        Year3.setOnClickListener {
            val intent = Intent(this, year3rd::class.java)
            startActivity(intent)
        }

        Year4.setOnClickListener {
            val intent = Intent(this, year4th::class.java)
            startActivity(intent)
        }
    }
}