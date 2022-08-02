package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.view.ViewParent
import android.widget.*
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import java.util.*
import androidx.lifecycle.ViewModel


class RegisterActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var pass: EditText
    private lateinit var language_spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

//        val languageArray = resources.getStringArray(R.array.language)
//        language_spinner = findViewById(R.id.language_spinnerx)
//        if(language_spinner != null){
//            val adapter = ArrayAdapter(this,
//                android.R.layout.simple_spinner_item, languageArray)
//            language_spinner.adapter = adapter
//        }
//
//        language_spinner.onItemSelectedListener = object :
//            AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(parent: AdapterView<*>,
//                                            view: View, position: Int, id: Long) {
//                    Toast.makeText(this@RegisterActivity,
//                        languageArray[position], Toast.LENGTH_SHORT).show()
//                }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//            }
//        }


        email = findViewById(R.id.email)
        pass = findViewById(R.id.pass)

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
                pass.error = "Wrong pass!"
            }
        }
        else{
            email.error = "Wrong email!"
        }

    }
}