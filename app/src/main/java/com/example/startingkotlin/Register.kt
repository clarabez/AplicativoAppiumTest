package com.example.startingkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Register : AppCompatActivity() {

        internal lateinit var btn: Button

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn = findViewById<Button>(R.id.BotaoVoltar) as Button
        btn.setOnClickListener{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
        }
}}
