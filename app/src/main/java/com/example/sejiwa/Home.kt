package com.example.sejiwa

import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.material.bottomappbar.BottomAppBar


class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            homepage()
        }
    }


    @Composable
    fun homepage() {
        //==============================================================
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Spacer(modifier = Modifier.height(6.dp)) //Jarak Aja

            Text(
                text = "Selamat Datang User",
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle(2)
            )

            Spacer(modifier = Modifier.height(5.dp)) //Jarak Aja


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
                        .clickable { }
                )

                Image(
                    painter = painterResource(id = R.drawable.explore),
                    contentDescription = "fitur konseling chat",
                    modifier = Modifier
                        .size(150.dp)
                        .clickable { }
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
                        .clickable { }
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

        NavigationBar(modifier = Modifier) {

            NavigationBarItem(
                selected = true,
                onClick = { /*TODO*/ },
                icon = {  })
        }
        }
    }

