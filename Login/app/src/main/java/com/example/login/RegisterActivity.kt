package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class RegisterActivity : AppCompatActivity() {
    lateinit var btn_register : AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_register.setOnClickListener {
            var main = Intent(this@RegisterActivity, MainActivity::class.java)
            startActivity(main)
        }
    }
}