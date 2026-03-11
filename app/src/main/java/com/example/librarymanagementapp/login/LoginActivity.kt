package com.example.librarymanagementapp.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.librarymanagementapp.R
import com.example.librarymanagementapp.dashboard.DashboardActivity
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginBtn = findViewById<MaterialButton>(R.id.loginBtn)

        loginBtn.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}