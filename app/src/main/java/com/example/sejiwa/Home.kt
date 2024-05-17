package com.example.sejiwa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.google.firebase.firestore.auth.User

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            homepage()
        }
    }

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Composable
    fun homepage() {
        Scaffold(bottomBar = { BottomNavigationBar() }) { paddingValues ->
            //==============================================================
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {

                Spacer(modifier = Modifier.height(50.dp)) //Jarak Aja

                Text(
                    text = "Selamat Datang User",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal // Ubah menjadi FontStyle.Italic
                )

                Spacer(modifier = Modifier.height(150.dp)) //Jarak Aja

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.konseling),
                        contentDescription = "tHIS IS A An IMAGE",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable { navigateToPage(chatroom::class.java) }
                    )

                    Image(
                        painter = painterResource(id = R.drawable.explore),
                        contentDescription = "fitur konseling chat",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable {navigateToPage(contentActivity::class.java) }
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.diari),
                        contentDescription = "tHIS IS A An IMAGE",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable { navigateToPage(diaryActivity::class.java)}
                    )

                    Image(
                        painter = painterResource(id = R.drawable.podkes),
                        contentDescription = "fitur konseling chat",
                        modifier = Modifier
                            .size(150.dp)
                            .clickable { }
                    )
                }
            }
        }
    }


    @Composable
    fun BottomNavigationBar() {
        NavigationBar(modifier = Modifier) {

            NavigationBarItem(
                selected = true,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_home_black_24dp),
                        contentDescription = null
                    )
                },
                label = { Text(text = "Home") }
            )

            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        painter = painterResource(id = com.google.android.material.R.drawable.ic_search_black_24),
                        contentDescription = null
                    )
                },
                label = { Text(text = "Search") }
            )

            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        painter = painterResource(id = androidx.core.R.drawable.ic_call_answer),
                        contentDescription = null
                    )
                },
                label = { Text(text = "Counseling") }
            )

            NavigationBarItem(
                selected = false,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_dashboard_black_24dp),
                        contentDescription = null
                    )
                },
                label = { Text(text = "Profile") }
            )
        }
    }

    private fun navigateToPage(java: Class<*>) {
        val intent = Intent(this, java)
        startActivity(intent)
    }
}
