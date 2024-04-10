package com.example.weatherapplication.presentation.ui.theme.forecast

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FavoritesList(
    favoriteLocations: List<String>,
    onRemoveFavorite: (String) -> Unit // Callback function to handle removal of a favorite location
) {
    Column {
        Text("Favorite Locations")
        Spacer(modifier = Modifier.height(8.dp))
        // Display list of favorite locations
        favoriteLocations.forEach { location ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Text(location)
                IconButton(
                    onClick = { onRemoveFavorite(location) }, // Invoke the callback function on click
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Icon(Icons.Default.Delete, contentDescription = "Remove")
                }
            }
        }
    }
}
