package com.example.lab2_ldl_s76120

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textAge = findViewById<TextView>(R.id.tvDisplayAge)
        val textName = findViewById<TextView>(R.id.tvDisplayName)

        val receivedName = intent.getStringExtra("NAME")?:"Empty Name"
        val receivedAge = intent.getStringExtra("AGE")?:"Empty Age"

        textName.text = "Name : $receivedName "
        textAge.text = "Age : $receivedAge"
    }
}