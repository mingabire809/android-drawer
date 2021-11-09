package com.example.drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Login : AppCompatActivity() {
  //  lateinit var binding:com.example.drawer.databinding.ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view)
        {
            var intent =  Itent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}