package com.example.newmutasi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newmutasi.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToHome()

    }

    private fun navigateToHome() {
        binding.btnMasuk.setOnClickListener {
            val navigate = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(navigate)
        }
    }

}