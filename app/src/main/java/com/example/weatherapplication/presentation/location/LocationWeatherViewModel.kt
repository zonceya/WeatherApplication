package com.example.weatherapplication.presentation.location

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapplication.domain.repository.WeatherRepository
import com.example.weatherapplication.domain.util.Constants
import com.example.weatherapplication.domain.util.SharedPreferencesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LocationWeatherViewModel @Inject constructor(
    private val repository: WeatherRepository,
    private val sharedPreferencesManager: SharedPreferencesManager
) : ViewModel() {

    var state by mutableStateOf(LocationWeatherState())
        private set
    val favoriteLocations = mutableStateOf(sharedPreferencesManager.getFavoriteLocations())

    fun addFavoriteLocation(location: String) {
        val currentFavorites = favoriteLocations.value.toMutableSet()
        currentFavorites.add(location)
        sharedPreferencesManager.saveFavoriteLocations(currentFavorites)
        // Update the mutable state after adding a location
        favoriteLocations.value = currentFavorites.toSet()
        getLocationCurrentWeather(location)
    }

    fun removeFavoriteLocation(location: String) {
        val currentFavorites = sharedPreferencesManager.getFavoriteLocations().toMutableSet()
        currentFavorites.remove(location)
        sharedPreferencesManager.saveFavoriteLocations(currentFavorites)
    }

    fun getFavoriteLocations(): Set<String> {
        return sharedPreferencesManager.getFavoriteLocations()
    }


    fun getLocationCurrentWeather(location: String) {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true,
                error = null
            )
            try {
                val result = repository.getLocationCurrentWeather(location, Constants.API_KEY)
                // Handle successful response
                state = state.copy(
                    locationWeatherInfo = result.data,
                    isLoading = false,
                    error = null
                )
            } catch (e: Exception) {
                // Handle error
                state = state.copy(
                    locationWeatherInfo = null,
                    isLoading = false,
                    error = e.message ?: "An unknown error occurred"
                )
            }
        }
}
}