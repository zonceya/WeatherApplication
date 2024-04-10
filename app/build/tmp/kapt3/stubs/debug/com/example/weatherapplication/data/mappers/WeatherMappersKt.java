package com.example.weatherapplication.data.mappers;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.example.weatherapplication.data.remote.WeatherDataDto;
import com.example.weatherapplication.data.remote.WeatherDto;
import com.example.weatherapplication.domain.weather.WeatherData;
import com.example.weatherapplication.domain.weather.WeatherInfo;
import com.example.weatherapplication.domain.weather.WeatherType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"toWeatherDataMap", "", "", "", "Lcom/example/weatherapplication/domain/weather/WeatherData;", "Lcom/example/weatherapplication/data/remote/WeatherDataDto;", "toWeatherInfo", "Lcom/example/weatherapplication/domain/weather/WeatherInfo;", "Lcom/example/weatherapplication/data/remote/WeatherDto;", "app_debug"})
public final class WeatherMappersKt {
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @org.jetbrains.annotations.NotNull
    public static final java.util.Map<java.lang.Integer, java.util.List<com.example.weatherapplication.domain.weather.WeatherData>> toWeatherDataMap(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.data.remote.WeatherDataDto $this$toWeatherDataMap) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @org.jetbrains.annotations.NotNull
    public static final com.example.weatherapplication.domain.weather.WeatherInfo toWeatherInfo(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.data.remote.WeatherDto $this$toWeatherInfo) {
        return null;
    }
}