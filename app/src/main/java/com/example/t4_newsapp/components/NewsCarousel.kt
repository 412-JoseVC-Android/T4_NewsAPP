package com.example.t4_newsapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.t4_newsapp.model.News
import com.example.t4_newsapp.model.newsList


@Composable
fun NewsCarousel() {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        items(newsList.take(3)) { news ->

            Box(modifier = Modifier.width(250.dp)) {

                NewsCardLarge(news)

            }

        }
    }
}