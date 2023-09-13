package com.tiashl.myapp5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    lateinit var inputFullName: EditText
    lateinit var inputEmail: EditText
    lateinit var inputPassword: EditText
    lateinit var  btnRegister: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        inputFullName = findViewById(R.id.regisFullName)
        inputEmail = findViewById(R.id.regisEmail)
        inputPassword = findViewById(R.id.regisPassword)
        btnRegister = findViewById(R.id.btnRegis)

        btnRegister.setOnClickListener{
            val fullName = inputFullName.text.toString()
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()

            val parseData = Intent(this@RegisterActivity, ProfileActivity::class.java)

            parseData.putExtra("fullName", fullName)
            parseData.putExtra("email", email)
            parseData.putExtra("password", password)
            startActivity(parseData)
        }

    }
}