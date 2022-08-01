package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class RegisterActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        email = findViewById(R.id.email)
        pass = findViewById(R.id.pass)

        email.addTextChangedListener(){
            email.setHintTextColor(Color.parseColor("#A8A8A8"))
            email.setHint("email:")
        }

        pass.addTextChangedListener(){
            pass.setHintTextColor(Color.parseColor("#A8A8A8"))
            pass.setHint("pass:")
        }
    }

    fun singUp(view: View) {
        val main = Intent(this, MainActivity::class.java)
        var text_email = email.text.toString()
        var text_pass = pass.text.toString()
        if ("@" in text_email && "." in text_email){
            if (text_pass.length >= 8) {
                main.putExtra("EMAIL_INFO", text_email)
                startActivity(main)
            }
            else{
                pass.setText("")
                pass.hint = "Wrong pass!"
                pass.setHintTextColor(Color.parseColor("#FF0000"))
            }
        }
        else{
            email.setText("")
            email.hint = "Wrong email!"
            email.setHintTextColor(Color.parseColor("#FF0000"))
        }

    }
}