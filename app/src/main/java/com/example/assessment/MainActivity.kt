package com.example.assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.assessment.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnbutton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            clearErrors()
            validateDetails()
        }
    }
fun validateDetails() {
    val username = binding.etusername.text.toString()
    val phonenumber = binding.etphonenumber.text.toString()
    val email = binding.etemail.text.toString()
    val password = binding.etpassword.text.toString()
    var error = false

    if (username.isBlank()) {
        binding.tilusername.error = "Username is required"
        error = true
    }
    if (phonenumber.isBlank()) {
        binding.tilphonenumber.error = "phone number is required"
        error = true
    }
    if (email.isBlank()) {
        binding.tilemail.error = "Email is required"
        error = true
    }

    if (password.isBlank()) {
        binding.tilpassword.error = "password is required"
        error = true
    }

    if (!error) {
        Toast.makeText(this, "Hello you have successfully registered ro our bills app", Toast.LENGTH_LONG).show()
    }
}

fun clearErrors() {
    binding.tilusername.error = null
    binding.tilphonenumber.error = null
    binding.tilemail.error = null
    binding.tilpassword.error = null
}
}


