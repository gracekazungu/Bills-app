package com.example.assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.assessment.databinding.ActivityMainBinding
import com.example.assessment.model.RegisterRequest
import com.example.assessment.viewmodel.UserViewModel
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
 val userViewModel: UserViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnbutton.setOnClickListener {
            validateDetails()
        }

        userViewModel.errLiveData.observe(this, Observer{ err->
            Toast.makeText(this, err, Toast.LENGTH_LONG).show()
        })
        userViewModel.regLiveData.observe(this, Observer{ regResponse->
            Toast.makeText(this,regResponse.message, Toast.LENGTH_LONG).show()
        })
    }
fun validateDetails() {
    val firstname = binding.etusername.text.toString()
    val phoneNumber = binding.etphonenumber.text.toString()
    val email = binding.etemail.text.toString()
    val password = binding.etpassword.text.toString()
    val confirmpassword=binding.etConfirmPassword.text.toString()
    val lastname=binding.etLastName.text.toString()
    var error = false

    if (firstname.isBlank()) {
        binding.tilusername.error = "First Name is required"
        error = true
    }
    if (lastname.isBlank()) {
        binding.tilusername.error = "Last Name is required"
        error = true
    }
    if (phoneNumber.isBlank()) {
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
    if (confirmpassword.isBlank()) {
        binding.tilpassword.error = "password is required"
        error = true
    }
    if (confirmpassword != password) {
        binding.tilpassword.error = "passwords must be equal"
        error = true
    }

    if (!error) {
//        val registerRequest=RegisterRequest(firstname,lastname,phoneNumber,email,password,confirmpassword)
        val registerRequest=RegisterRequest(
            firstname=firstname,
            lastname=lastname,
            email=email,
            password=password,
            phoneNumber = phoneNumber
        )
        userViewModel.registerUser(registerRequest)
    }
}

//fun clearErrors() {
//    binding.tilusername.error = null
//    binding.tilphonenumber.error = null
//    binding.tilemail.error = null
//    binding.tilpassword.error = null
//}
}


