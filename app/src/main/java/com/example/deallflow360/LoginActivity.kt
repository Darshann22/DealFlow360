package com.example.deallflow360

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty()) {
                etEmail.error = "Enter your email"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Enter your password"
                return@setOnClickListener
            }

            // Temporary navigation
            // Backend authentication will be added later.

            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)

            finish()
        }
    }
}