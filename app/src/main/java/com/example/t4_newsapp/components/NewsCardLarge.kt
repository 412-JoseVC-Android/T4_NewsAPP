package com.example.t4_newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.t4_newsapp.model.News

@Composable
fun NewsCardLarge(news: News) {

    Box(
        modifier = Modifier
            .width(260.dp)
            .height(150.dp)
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFF6C63FF),
                        Color(0xFF7F6CFF)
                    )
                ),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(16.dp)
    ) {

        Column {

            Text(
                text = news.title,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = news.date,
                color = Color.White
            )
        }
    }
}