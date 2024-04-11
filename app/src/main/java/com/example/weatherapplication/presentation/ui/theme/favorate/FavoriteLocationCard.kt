package com.example.weatherapplication.presentation.ui.theme.favorate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.example.weatherapplication.presentation.location.LocationWeatherViewModel

@Composable
fun FavoriteLocationCard(viewModel: LocationWeatherViewModel) {

    val favoriteLocations by remember { viewModel.favoriteLocations }

    FavoritesList(
        favoriteLocations = favoriteLocations.toList(),
        onRemoveFavorite = { location ->
            // Implement removal logic here, such as calling a ViewModel function
            viewModel.removeFavoriteLocation(location)
        }
    )
}
