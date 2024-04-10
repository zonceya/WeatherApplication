package com.example.weatherapplication.presentation.ui.theme.location;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.layout.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import com.example.weatherapplication.presentation.location.LocationWeatherState;
import com.example.weatherapplication.R;
import com.example.weatherapplication.domain.weather.WeatherType;
import com.example.weatherapplication.domain.weather.current.CurrentWeatherData;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\rH\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"LocationWeatherCard", "", "state", "Lcom/example/weatherapplication/presentation/location/LocationWeatherState;", "modifier", "Landroidx/compose/ui/Modifier;", "getBackgroundColorsForWeatherType", "Landroidx/compose/ui/graphics/Color;", "weatherType", "Lcom/example/weatherapplication/domain/weather/current/CurrentWeatherData;", "(Lcom/example/weatherapplication/domain/weather/current/CurrentWeatherData;)J", "getBackgroundImagesForWeatherType", "", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "app_debug"})
public final class LocationWeatherCardKt {
    
    @androidx.compose.runtime.Composable
    public static final void LocationWeatherCard(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.presentation.location.LocationWeatherState state, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.annotation.DrawableRes
    public static final int getBackgroundImagesForWeatherType(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.domain.weather.WeatherType weatherType) {
        return 0;
    }
    
    @androidx.compose.runtime.Composable
    public static final long getBackgroundColorsForWeatherType(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.domain.weather.current.CurrentWeatherData weatherType) {
        return 0L;
    }
}