package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {

    private lateinit var edtTxtName: EditText
    private lateinit var edtTxtEmail: EditText
    private lateinit var edtTxtPassword: EditText
    private lateinit var btnSignup: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        mAuth = FirebaseAuth.getInstance()

        edtTxtName = findViewById(R.id.edtTxtName)
        edtTxtEmail = findViewById(R.id.edtTxtEmail)
        edtTxtPassword = findViewById(R.id.edtTxtPassword)
        btnSignup = findViewById(R.id.btnSignUp)

        btnSignup.setOnClickListener {
            val email = edtTxtEmail.text.toString()
            val password = edtTxtPassword.text.toString()

            signUp(email, password)
        }

    }

    private fun signUp(email: String, password: String) {
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    val intent = Intent(this@Signup, Year::class.java)
                    startActivity(intent)

                } else {
                    Toast.makeText(this@Signup, "Lmao ded", Toast.LENGTH_SHORT).show()
                }
            }
    }

}