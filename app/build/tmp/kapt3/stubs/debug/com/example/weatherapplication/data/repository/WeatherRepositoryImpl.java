package com.example.weatherapplication.data.repository;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.example.weatherapplication.data.remote.WeatherApi;
import com.example.weatherapplication.domain.repository.WeatherRepository;
import com.example.weatherapplication.domain.util.Resource;
import com.example.weatherapplication.domain.weather.current.CurrentWeatherData;
import com.example.weatherapplication.domain.weather.current.CurrentWeatherInfo;
import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherData;
import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherInfo;
import com.example.weatherapplication.domain.weather.location.LocationWeatherData;
import com.example.weatherapplication.domain.weather.location.LocationWeatherInfo;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/weatherapplication/data/repository/WeatherRepositoryImpl;", "Lcom/example/weatherapplication/domain/repository/WeatherRepository;", "api", "Lcom/example/weatherapplication/data/remote/WeatherApi;", "(Lcom/example/weatherapplication/data/remote/WeatherApi;)V", "getCurrentWeather", "Lcom/example/weatherapplication/domain/util/Resource;", "Lcom/example/weatherapplication/domain/weather/current/CurrentWeatherInfo;", "lat", "", "lon", "appid", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationCurrentWeather", "Lcom/example/weatherapplication/domain/weather/location/LocationWeatherInfo;", "location", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherForecast", "Lcom/example/weatherapplication/domain/weather/forecast/ForecastWeatherInfo;", "app_debug"})
public final class WeatherRepositoryImpl implements com.example.weatherapplication.domain.repository.WeatherRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.weatherapplication.data.remote.WeatherApi api = null;
    
    @javax.inject.Inject
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.data.remote.WeatherApi api) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCurrentWeather(double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.domain.util.Resource<com.example.weatherapplication.domain.weather.current.CurrentWeatherInfo>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getWeatherForecast(double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.domain.util.Resource<com.example.weatherapplication.domain.weather.forecast.ForecastWeatherInfo>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getLocationCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String location, @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.domain.util.Resource<com.example.weatherapplication.domain.weather.location.LocationWeatherInfo>> $completion) {
        return null;
    }
}