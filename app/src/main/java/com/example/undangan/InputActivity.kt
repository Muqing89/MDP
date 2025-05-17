package com.example.undangan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button

class InputActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val btnMasuk = findViewById<Button>(R.id.btnMasuk)

        btnMasuk.setOnClickListener {
            // Pindah ke SecondActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
