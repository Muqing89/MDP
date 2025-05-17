package com.example.undangan

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menampilkan layout activity_main.xml
        setContentView(R.layout.activity_main)
    }
}
