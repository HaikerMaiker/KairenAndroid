package com.example.kairen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun avanzarRegistro(view: View){
        val next = Intent(this, RegisterActivity::class.java)
        startActivity(next)
    }

    fun avanzarLogin(view:View){
        val next = Intent(this, LoginActivity::class.java)
        startActivity(next)
    }
}