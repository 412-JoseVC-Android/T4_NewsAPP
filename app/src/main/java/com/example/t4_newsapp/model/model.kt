package com.example.t4_newsapp.model

data class News(
    val title: String,
    val date: String,
    val image: Int
)

val newsList = listOf(
    News("Noticia de ejemplo 1", "febrero 08 - 2024", 0),
    News("Noticia de ejemplo 2", "febrero 07 - 2024", 0)
)