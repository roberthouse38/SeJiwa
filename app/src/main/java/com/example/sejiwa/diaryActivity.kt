package com.example.sejiwa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

class diaryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            diaryPage()
        }
    }


    @Composable
    fun diaryPage() {
        Scaffold(bottomBar = { BottomNavigationBar() }) { paddingValues ->
            //==============================================================
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Text(text = "Hello This Is Chat Page")
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
}