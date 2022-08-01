package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var name1: TextView

    companion object{
        const val EMAIL_INFO = "EMAIL_INFO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name1 = findViewById(R.id.name1)
        val text_email = intent.getStringExtra(EMAIL_INFO)
        val text_email1 = text_email?.split('.')
        if( '@' in text_email1?.get(0)!!) {
            val text_email_dog =  text_email1.get(0).split("@")
            name1.text = text_email_dog.get(0).capitalize()

        } else if('@' in text_email1.get(1)){
            val text_email_dog =  text_email1.get(1).split("@")
            name1.text = text_email1.get(0).capitalize() + " " + text_email_dog.get(0).capitalize()
        } else {
            name1.text = text_email1.get(0).capitalize() + " " + text_email1.get(1).capitalize()
        }


    }


}