package com.example.weatherapplication.domain.util

import kotlin.math.roundToInt

fun kelvinToCelsius(kelvin: Double): Double {
    return (kelvin - 273.15)
}

// Function to format temperature for display
fun displayTemperature(temp: Double): String {
    val celsiusTemp = kelvinToCelsius(temp)
    return "${celsiusTemp.roundToInt()}"
}