package com.example.weatherapplication.data.remote;

import com.squareup.moshi.Json;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003Ji\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/example/weatherapplication/data/remote/WeatherDataDto;", "", "time", "", "", "temperatures", "", "weatherCodes", "", "pressures", "windSpeeds", "humidities", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getHumidities", "()Ljava/util/List;", "getPressures", "getTemperatures", "getTime", "getWeatherCodes", "getWindSpeeds", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherDataDto {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> time = null;
    @com.squareup.moshi.Json(name = "temperature_2m")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> temperatures = null;
    @com.squareup.moshi.Json(name = "weathercode")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> weatherCodes = null;
    @com.squareup.moshi.Json(name = "pressure_msl")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> pressures = null;
    @com.squareup.moshi.Json(name = "windspeed_10m")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> windSpeeds = null;
    @com.squareup.moshi.Json(name = "relativehumidity_2m")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> humidities = null;
    
    public WeatherDataDto(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> time, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> temperatures, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> weatherCodes, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> pressures, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> windSpeeds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> humidities) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> getTemperatures() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getWeatherCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> getPressures() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> getWindSpeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> getHumidities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.weatherapplication.data.remote.WeatherDataDto copy(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> time, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> temperatures, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> weatherCodes, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> pressures, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> windSpeeds, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> humidities) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}