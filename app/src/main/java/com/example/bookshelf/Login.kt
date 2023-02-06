package com.example.bookshelf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    private lateinit var edtTxtPassword: EditText
    private lateinit var edtTxtEmail: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSignup: Button
    private lateinit var btnSkip: Button
    private lateinit var mAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mAuth = FirebaseAuth.getInstance()

        edtTxtEmail = findViewById(R.id.edtTxtEmail)
        edtTxtPassword = findViewById(R.id.edtTxtPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnSignup = findViewById(R.id.btnSignUp)
        btnSkip = findViewById(R.id.btnSkip)

        btnSignup.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        btnSkip.setOnClickListener {
            val intent  = Intent(this, Year::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            val email = edtTxtEmail.text.toString()
            val password = edtTxtPassword.text.toString()

            login(email, password);
        }
    }

    private fun login(email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val intent = Intent(this@Login,Year::class.java)
                    startActivity(intent)
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(this@Login,"L bozo, make account first", Toast.LENGTH_SHORT).show()
                }
            }
    }
}