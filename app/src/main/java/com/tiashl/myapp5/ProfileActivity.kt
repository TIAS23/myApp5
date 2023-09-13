package com.tiashl.myapp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {

    lateinit var getFullName: TextView
    lateinit var getEmail: TextView
    lateinit var getPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        getFullName = findViewById(R.id.txtFullName)
        getEmail = findViewById(R.id.txtEmail)
        getPassword = findViewById(R.id.txtPassword)

        getFullName.text = intent.extras?.getString("fullName")
        getEmail.text = intent.extras?.getString("email")
        getPassword.text = intent.extras?.getString("password")


    }
}