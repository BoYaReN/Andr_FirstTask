package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var pass: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        email = findViewById(R.id.email)
        pass = findViewById(R.id.pass)
    }

    fun singUp(view: View){
        val main = Intent(this, MainActivity::class.java)
        startActivity(main)
    }
}