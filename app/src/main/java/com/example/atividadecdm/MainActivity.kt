package com.example.atividadecdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonClear)
        button.setOnClickListener {
            findViewById<EditText>(R.id.loginInput).setText("")
            findViewById<EditText>(R.id.passwordInput).setText("")
        }
    }
}