package com.example.assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assessment.databinding.ActivityLoginBinding

//class LoginActivity : AppCompatActivity() {
//    lateinit var binding: ActivityLoginBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding=ActivityLoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        binding.btnbutton2.setOnClickListener {
//            clearErrors()
//            validatedetails()
//        }
//    }
//
//    fun validatedetails() {
//        val username = binding.etUsername.text.toString()
//        val email = binding.etEmail.text.toString()
//        val password = binding.etPassword.text.toString()
//        var error = false
//
//        if (username.isBlank()) {
//            binding.tilUsername.error = "username is required"
//            error = true
//        }
//        if (email.isBlank()) {
//            binding.tilEmail.error = "Email is required"
//            error = true
//        }
//
//        if (password.isBlank()) {
//            binding.tilPassword.error = "password is required"
//            error = true
//        }
//
//        if (!error) {
//            Toast.makeText(this, "Hello you have successfully logged to yourr account", Toast.LENGTH_LONG).show()
//        }
//    }
//
//    fun clearErrors() {
//        binding.tilUsername.error = null
//        binding.tilEmail.error = null
//        binding.tilPassword.error = null
//    }
//}
