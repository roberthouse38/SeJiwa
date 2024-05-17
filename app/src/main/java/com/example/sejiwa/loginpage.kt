package com.example.sejiwa

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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


/*
@Composable
fun loginscreen(){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
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
        Text(text = "Login To Your Account",
            fontWeight = FontWeight.Light,
            fontSize = 15.sp
            )

        Spacer(modifier = Modifier.height(20.dp)) //Jarak lg

        //Tempat Input Email/Username
        OutlinedTextField(  value = email,
                            onValueChange = {email = it},
                            label = {Text(text = "Username/Email")})

        Spacer(modifier = Modifier.height(10.dp)) //Jarak

        //Tempat Input Password
        OutlinedTextField(  value = password,
                            onValueChange = {password = it},
                            label = {Text(text = "Password")},
                            visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(20.dp)) //Jarak

        //Tombol Login
        Button(onClick =
        { Log.i("Credential", "email = $email password = $password")
            val intent = Intent()


        }) {
            Text(text = "Sign In")
        }

        Spacer(modifier = Modifier.height(20.dp)) //Jarak

        //Tombol lupa Input Data Password
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Forget Password?")
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Or Continue With", modifier = Modifier.clickable {  })

        //Untuk Mengatur Logo
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            Image(painter = painterResource(id = R.drawable.facbook),
                contentDescription = "Logo Facebook",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        //facebookclicked
                    }
            )

            Image(painter = painterResource(id = R.drawable.google_logo),
                contentDescription = "Logo Google",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        //google logo
                    }
            )
        }
        //Untuk Mengatur Logo

    }
}
*/
