package com.example.t4_newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun Tabs() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(
            32.dp,
            alignment = Alignment.CenterHorizontally
            )

    ) {

        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

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