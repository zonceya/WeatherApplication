
package com.example.weatherapplication.domain.util

import android.content.SharedPreferences

class SharedPreferencesManager(private val sharedPreferences: SharedPreferences) {
    fun saveFavoriteLocations(locations: Set<String>) {
        val editor = sharedPreferences.edit()
        editor.putStringSet("favorite_locations", locations)
        editor.apply()
    }

    fun getFavoriteLocations(): Set<String> {
        return sharedPreferences.getStringSet("favorite_locations", emptySet()) ?: emptySet()
    }
}

