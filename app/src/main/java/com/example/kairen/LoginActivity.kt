package com.example.kairen

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import android.util.Log
import android.util.Log.d
import android.view.View
import android.widget.EditText
import android.widget.Toast



class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var textCorreo: EditText
    private lateinit var textContra: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth = Firebase.auth
        textCorreo = findViewById(R.id.campo3_registrar2)
        textContra = findViewById(R.id.campo4_registrar2)
    }
    private fun checkAccount(email: String, password: String) {
        // [START create_user_with_email]
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    //d(TAG, "signInWithEmail:success")
                    val user = auth.currentUser
                    val pasar: Intent = Intent(this, DecideActivity::class.java)
                    startActivity(pasar)
                } else {
                    // If sign in fails, display a message to the user.
                    //Log.w(TAG, "signInWithEmail:failure", task.exception)
                    val pasar: Intent = Intent(this, MainActivity::class.java)
                    startActivity(pasar)
                }
            }
    }

    public fun iniciarSesion(view: View) {
        checkAccount(textCorreo.getText().toString(), textContra.getText().toString())
    }

}