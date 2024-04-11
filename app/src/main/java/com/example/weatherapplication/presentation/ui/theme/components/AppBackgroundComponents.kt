package com.example.weatherapplication.presentation.ui.theme.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.weatherapplication.R
import com.example.weatherapplication.domain.weather.WeatherType
import com.example.weatherapplication.presentation.ui.theme.Cloudy
import com.example.weatherapplication.presentation.ui.theme.Rainy
import com.example.weatherapplication.presentation.ui.theme.Sunny

@Composable
fun getWeatherIcon(weatherType: WeatherType): Painter {
    return when (weatherType) {
        is WeatherType.ClearSky -> painterResource(id = R.drawable.clear)
        is WeatherType.MainlyClear -> painterResource(id = R.drawable.clear)
        is WeatherType.PartlyCloudy -> painterResource(id = R.drawable.partlysunny)
        is WeatherType.Overcast -> painterResource(id = R.drawable.partlysunny)
        is WeatherType.Foggy -> painterResource(id = R.drawable.partlysunny)
        is WeatherType.DepositingRimeFog -> painterResource(id = R.drawable.partlysunny)
        is WeatherType.LightDrizzle -> painterResource(id = R.drawable.rain)
        is WeatherType.ModerateDrizzle -> painterResource(id = R.drawable.rain)
        is WeatherType.DenseDrizzle -> painterResource(id = R.drawable.rain)
        is WeatherType.SlightRain -> painterResource(id = R.drawable.rain)
        is WeatherType.ModerateRain -> painterResource(id = R.drawable.rain)
        is WeatherType.HeavyRain -> painterResource(id = R.drawable.rain)
        is WeatherType.ModerateRainShowers -> painterResource(id = R.drawable.rain)
        is WeatherType.ViolentRainShowers -> painterResource(id = R.drawable.rain)
    }
}
@Composable
fun getBackgroundWeatherImage(weatherType: WeatherType): Painter {
    return when (weatherType) {
        is WeatherType.ClearSky -> painterResource(id = R.drawable.background_forest_sunny)
        is WeatherType.MainlyClear -> painterResource(id = R.drawable.background_forest_sunny)
        is WeatherType.PartlyCloudy -> painterResource(id = R.drawable.background_forest_cloudy)
        is WeatherType.Overcast -> painterResource(id = R.drawable.background_forest_cloudy)
        is WeatherType.Foggy -> painterResource(id = R.drawable.background_forest_cloudy)
        is WeatherType.DepositingRimeFog -> painterResource(id = R.drawable.background_forest_cloudy)
        is WeatherType.LightDrizzle -> painterResource(id = R.drawable.background_forest_rainy)
        is WeatherType.ModerateDrizzle -> painterResource(id = R.drawable.background_forest_rainy)
        is WeatherType.DenseDrizzle -> painterResource(id = R.drawable.background_forest_rainy)
        is WeatherType.SlightRain -> painterResource(id = R.drawable.background_forest_rainy)
        is WeatherType.ModerateRain -> painterResource(id = R.drawable.background_forest_rainy)
        is WeatherType.HeavyRain -> painterResource(id = R.drawable.background_forest_rainy)
        is WeatherType.ModerateRainShowers -> painterResource(id = R.drawable.background_forest_rainy)
        is WeatherType.ViolentRainShowers -> painterResource(id = R.drawable.background_forest_rainy)

    }
}
@Composable
fun getBackgroundImageForWeatherDescription(description: String): Painter {
    val weatherType = when (description) {
        "Clear sky" -> WeatherType.ClearSky
        "Mainly clear" -> WeatherType.MainlyClear
        "Partly cloudy" -> WeatherType.PartlyCloudy
        "Overcast" -> WeatherType.Overcast
        "few clouds" -> WeatherType.PartlyCloudy
        "broken clouds" -> WeatherType.PartlyCloudy
        "Foggy" -> WeatherType.Foggy
        "Depositing rime fog" -> WeatherType.DepositingRimeFog
        "Light drizzle" -> WeatherType.LightDrizzle
        "Moderate drizzle" -> WeatherType.ModerateDrizzle
        "Dense drizzle" -> WeatherType.DenseDrizzle
        "Slight rain" -> WeatherType.SlightRain
        "Rainy" -> WeatherType.ModerateRain
        "Heavy rain" -> WeatherType.HeavyRain
        "Moderate rain showers" -> WeatherType.ModerateRainShowers
        "Violent rain showers" -> WeatherType.ViolentRainShowers
        else -> WeatherType.ClearSky // Default to ClearSky if description doesn't match any known weather type
    }
    return getBackgroundWeatherImage(weatherType)
}
@Composable
fun getBackgroundIcon(description: String): Painter {
    val weatherType = when (description) {
        "Clear sky" -> WeatherType.ClearSky
        "Mainly clear" -> WeatherType.MainlyClear
        "Partly cloudy" -> WeatherType.PartlyCloudy
        "Overcast" -> WeatherType.Overcast
        "few clouds" -> WeatherType.PartlyCloudy
        "broken clouds" -> WeatherType.PartlyCloudy
        "Foggy" -> WeatherType.Foggy
        "Depositing rime fog" -> WeatherType.DepositingRimeFog
        "Light drizzle" -> WeatherType.LightDrizzle
        "Moderate drizzle" -> WeatherType.ModerateDrizzle
        "Dense drizzle" -> WeatherType.DenseDrizzle
        "Slight rain" -> WeatherType.SlightRain
        "Rainy" -> WeatherType.ModerateRain
        "Heavy rain" -> WeatherType.HeavyRain
        "Moderate rain showers" -> WeatherType.ModerateRainShowers
        "Violent rain showers" -> WeatherType.ViolentRainShowers
        else -> WeatherType.ClearSky // Default to ClearSky if description doesn't match any known weather type
    }
    return getWeatherIcon(weatherType)
}
@Composable
fun getBackgroundColorForWeatherType(weatherType: WeatherType): Color {
    return when (weatherType) {
        is WeatherType.ClearSky -> Sunny
        is WeatherType.MainlyClear -> Sunny
        is WeatherType.PartlyCloudy -> Cloudy
        is WeatherType.Overcast -> Cloudy
        is WeatherType.Foggy -> Cloudy
        is WeatherType.DepositingRimeFog -> Cloudy
        is WeatherType.LightDrizzle -> Rainy
        is WeatherType.ModerateDrizzle -> Rainy
        is WeatherType.DenseDrizzle -> Rainy
        is WeatherType.SlightRain -> Rainy
        is WeatherType.ModerateRain -> Rainy
        is WeatherType.HeavyRain -> Rainy
        is WeatherType.ModerateRainShowers -> Rainy
        is WeatherType.ViolentRainShowers -> Rainy
    }
}
@Composable
fun getBackgroundColor(description: String): Color {
    val weatherType = when (description) {
        "Clear sky" -> WeatherType.ClearSky
        "Mainly clear" -> WeatherType.MainlyClear
        "Partly cloudy" -> WeatherType.PartlyCloudy
        "few clouds" -> WeatherType.PartlyCloudy
        "broken clouds" -> WeatherType.PartlyCloudy
        "Overcast" -> WeatherType.Overcast
        "Foggy" -> WeatherType.Foggy
        "Depositing rime fog" -> WeatherType.DepositingRimeFog
        "Light drizzle" -> WeatherType.LightDrizzle
        "Moderate drizzle" -> WeatherType.ModerateDrizzle
        "Dense drizzle" -> WeatherType.DenseDrizzle
        "Slight rain" -> WeatherType.SlightRain
        "Rainy" -> WeatherType.ModerateRain
        "Heavy rain" -> WeatherType.HeavyRain
        "Moderate rain showers" -> WeatherType.ModerateRainShowers
        "Violent rain showers" -> WeatherType.ViolentRainShowers
        else -> WeatherType.ClearSky // Default to ClearSky if description doesn't match any known weather type
    }
    return getBackgroundColorForWeatherType(weatherType)
}
