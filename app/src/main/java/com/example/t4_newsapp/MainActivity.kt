package com.example.t4_newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.t4_newsapp.components.SearchBar
import com.example.t4_newsapp.components.Tabs
import com.example.t4_newsapp.ui.theme.T4NewsAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            T4NewsAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    NewsScreen()
                }
            }
        }
    }
}

@Composable
fun NewsScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        SearchBar()

        Spacer(modifier = Modifier.height(20.dp))

        Tabs()

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Últimas noticias",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Alrededor del mundo",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
    }
}