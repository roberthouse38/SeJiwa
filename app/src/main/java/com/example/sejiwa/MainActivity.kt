package com.example.sejiwa

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.firebase.auth.FirebaseAuth

class MainActivity : ComponentActivity() {

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
        }

        // Ininisialisasi Autentikasi Dari Firebase
        // (google-services.json ditambahkan ke direktori app)
        firebaseAuth = FirebaseAuth.getInstance()

        setContent {
            loginscreen()
        }
    }

    @Composable
    fun loginscreen() {

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            //Gambar Atas
            Image(
                painter = painterResource(id = R.drawable.signin_page),
                contentDescription = "login image",
                modifier = Modifier.height(200.dp)
            )

            //Kata Sambutan
            Text(
                text = "Welcome Back",
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp
            )

            Spacer(modifier = Modifier.height(5.dp)) //Jarak Aja

            //Kalimat Login
            Text(
                text = "Login To Your Account",
                fontWeight = FontWeight.Light,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(20.dp)) //Jarak lg

            //Tempat Input Email/Username
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(text = "Username/Email") }
            )

            Spacer(modifier = Modifier.height(10.dp)) //Jarak

            //Tempat Input Password
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(20.dp)) //Jarak

            //Tombol Login
            Button(onClick = {
                signInWithEmailAndPassword(email, password)
            }) {
                Text(text = "Sign In")
            }

            Spacer(modifier = Modifier.height(20.dp)) //Jarak

            //Tombol lupa Input Data Password
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Forget Password?")
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Or Continue With", modifier = Modifier.clickable { })

            //Untuk Mengatur Logo
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facbook),
                    contentDescription = "Logo Facebook",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {
                            //facebookclicked
                        }
                )

                Image(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "Logo Google",
                    modifier = Modifier
                        .size(40.dp)
                        .clickable {
                            //google logo
                        }
                )
            }
        }
    }

    private fun signInWithEmailAndPassword(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, navigate to Home
                    Log.d("FirebaseAuth", "signInWithEmail:success")
                    val intent = Intent(this, Home::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("FirebaseAuth", "signInWithEmail:failure", task.exception)
                    Toast.makeText(
                        this, "Authentication failed: ${task.exception?.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }
}
