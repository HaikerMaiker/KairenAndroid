package com.example.kairen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class RegisterActivity : AppCompatActivity() {
// ...
// Initialize Firebase Auth
    private lateinit var textCorreo: EditText
    private lateinit var textContra: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        textCorreo = findViewById(R.id.campo3_registrar)
        textContra = findViewById(R.id.campo4_registrar)
    }

    fun avanzarNext(view: View){
        val pasaCorreo = Intent(this@RegisterActivity, Registro2Activity::class.java)
        pasaCorreo.putExtra("correo", textCorreo.getText().toString())
        pasaCorreo.putExtra("contraseña", textContra.getText().toString())
        startActivity(pasaCorreo)

    }



}