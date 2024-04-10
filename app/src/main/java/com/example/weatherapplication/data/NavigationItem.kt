package com.example.weatherapplication.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val description: String,
    val itemId: String,
    val icon: ImageVector,
    val isFavoriteAction: Boolean = false
)
val navigationItemsList = listOf<NavigationItem>(
    NavigationItem(
        title = "Favorite",
        icon = Icons.Default.Favorite,
        description = "Favorite Screen",
        itemId = "favoriteScreen"
    )
)