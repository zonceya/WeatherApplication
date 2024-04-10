package com.example.weatherapplication.data.remote;

import com.example.weatherapplication.data.remote.current.CurrentWeatherDataDto;
import com.example.weatherapplication.data.remote.forecast.ForecastWeatherDataDTO;
import com.example.weatherapplication.data.remote.location.LocationWeatherDataDto;
import retrofit2.http.GET;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/weatherapplication/data/remote/WeatherApi;", "", "getCurrentWeather", "Lcom/example/weatherapplication/data/remote/current/CurrentWeatherDataDto;", "lat", "", "lon", "appid", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherByLocation", "Lcom/example/weatherapplication/data/remote/location/LocationWeatherDataDto;", "location", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherForecast", "Lcom/example/weatherapplication/data/remote/forecast/ForecastWeatherDataDTO;", "app_debug"})
public abstract interface WeatherApi {
    
    @retrofit2.http.GET(value = "weather?")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCurrentWeather(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @retrofit2.http.Query(value = "appid")
    @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.data.remote.current.CurrentWeatherDataDto> $completion);
    
    @retrofit2.http.GET(value = "forecast?")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherForecast(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @retrofit2.http.Query(value = "appid")
    @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.data.remote.forecast.ForecastWeatherDataDTO> $completion);
    
    @retrofit2.http.GET(value = "weather?")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherByLocation(@retrofit2.http.Query(value = "q")
    @org.jetbrains.annotations.NotNull
    java.lang.String location, @retrofit2.http.Query(value = "appid")
    @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.data.remote.location.LocationWeatherDataDto> $completion);
}