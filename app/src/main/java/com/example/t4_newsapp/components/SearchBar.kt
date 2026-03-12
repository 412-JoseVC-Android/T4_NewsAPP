package com.example.t4_newsapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

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