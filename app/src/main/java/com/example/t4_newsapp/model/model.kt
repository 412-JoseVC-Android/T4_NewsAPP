package com.example.t4_newsapp.model

import java.net.URL

data class News(
    val title: String,
    val date: String,
    val imageURL: String
)

val newsList = listOf(
    News(
        "El presidente de EE.UU. no muestra arrepentimiento",
        "febrero 08 - 2024",
        "https://elordenmundial.com/wp-content/uploads/2024/11/vuelve-donald-trump.jpg"
    ),
    News(
        "Bañarse en la piscina del desierto de Cleopatra",
        "febrero 07 - 2024",
        "https://www.lopezlinaresvintagejewelry.com/wp-content/uploads/2023/12/Cleopatra-pendientes-cobra.jpeg"
    ),
    News(
        "Gigantes tecnológicos",
        "febrero 05 - 2024",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6m_YKbhTk5QQF-WMLZME3neWRGuBx9gM7Ow&s"
    ),
    News(
        "El rover de Marte envía nuevas imágenes",
        "febrero 02 - 2024",
        "https://josevicentediaz.com/wp-content/uploads/2014/09/matt.jpg"
    )
)