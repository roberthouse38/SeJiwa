package com.example.sejiwa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class chatroom : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            chatpage()
        }
    }
    
    
    @Composable
    fun chatpage() {
        Text(text = "Hello This Is Chat Page")
    }
    
}