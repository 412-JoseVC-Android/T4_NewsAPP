package com.example.t4_newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
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

data class News(
    val title: String,
    val date: String,
    val image: Int
)

val newsList = listOf(
    News("Noticia de ejemplo 1", "febrero 08 - 2024", 0),
    News("Noticia de ejemplo 2", "febrero 07 - 2024", 0),
)

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

@Composable
fun SearchBar() {

    TextField(
        value = "",
        onValueChange = {},
        placeholder = { Text("Buscar") },

        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = null)
        },

        shape = RoundedCornerShape(30.dp),

        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Tabs() {

    Row(
        horizontalArrangement = Arrangement.spacedBy(24.dp)
    ) {

        Column {

            Text(
                text = "Noticias",
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Box(
                modifier = Modifier
                    .height(3.dp)
                    .width(40.dp)
                    .background(Color(0xFF6C63FF))
            )
        }

        Text("Eventos", color = Color.Gray)

        Text("Clima", color = Color.Gray)
    }
}