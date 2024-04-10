package com.example.weatherapplication.domain.repository;

import com.example.weatherapplication.domain.util.Resource;
import com.example.weatherapplication.domain.weather.current.CurrentWeatherInfo;
import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherInfo;
import com.example.weatherapplication.domain.weather.location.LocationWeatherInfo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/weatherapplication/domain/repository/WeatherRepository;", "", "getCurrentWeather", "Lcom/example/weatherapplication/domain/util/Resource;", "Lcom/example/weatherapplication/domain/weather/current/CurrentWeatherInfo;", "lat", "", "long", "appid", "", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationCurrentWeather", "Lcom/example/weatherapplication/domain/weather/location/LocationWeatherInfo;", "q", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherForecast", "Lcom/example/weatherapplication/domain/weather/forecast/ForecastWeatherInfo;", "app_debug"})
public abstract interface WeatherRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCurrentWeather(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.domain.util.Resource<com.example.weatherapplication.domain.weather.current.CurrentWeatherInfo>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getWeatherForecast(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.domain.util.Resource<com.example.weatherapplication.domain.weather.forecast.ForecastWeatherInfo>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLocationCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String q, @org.jetbrains.annotations.NotNull
    java.lang.String appid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.weatherapplication.domain.util.Resource<com.example.weatherapplication.domain.weather.location.LocationWeatherInfo>> $completion);
}