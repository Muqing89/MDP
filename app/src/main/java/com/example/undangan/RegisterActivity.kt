package com.example.undangan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.widget.Button
import android.widget.EditText
import android.widget.*


class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val editNama = findViewById<EditText>(R.id.editNama)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val switchNewsletter = findViewById<Switch>(R.id.switchNewsletter)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)

        btnDaftar.setOnClickListener {
            val nama = editNama.text.toString()
            val email = editEmail.text.toString()
            val password = editPassword.text.toString()
            val terimaNewsletter = switchNewsletter.isChecked

            Toast.makeText(
                this,
                "Nama: $nama\nEmail: $email\nNewsletter: $terimaNewsletter",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

