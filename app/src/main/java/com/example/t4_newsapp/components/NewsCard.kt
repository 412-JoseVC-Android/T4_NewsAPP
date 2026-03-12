package com.example.t4_newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.t4_newsapp.model.News
import coil3.compose.AsyncImage

@Composable
fun NewsCard(news: News) {

    Box(
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
    )  {

        AsyncImage(
            model = news.imageURL,
            contentDescription = news.title,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .fillMaxWidth()
                .height(85.dp)
                .background(Color.LightGray)
                .padding(horizontal = 8.dp),
            contentAlignment = Alignment.CenterStart
        ) {

            Text(
                text = news.title,
                fontWeight = FontWeight.Bold
            )
        }
    }
}