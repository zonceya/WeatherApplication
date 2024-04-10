package com.example.weatherapplication.domain.weather;

import androidx.annotation.DrawableRes;
import com.example.weatherapplication.R;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u000f\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u000e\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'\u00a8\u0006("}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType;", "", "weatherDesc", "", "iconRes", "", "(Ljava/lang/String;I)V", "getIconRes", "()I", "getWeatherDesc", "()Ljava/lang/String;", "ClearSky", "Companion", "DenseDrizzle", "DepositingRimeFog", "Foggy", "HeavyRain", "LightDrizzle", "MainlyClear", "ModerateDrizzle", "ModerateRain", "ModerateRainShowers", "Overcast", "PartlyCloudy", "SlightRain", "ViolentRainShowers", "Lcom/example/weatherapplication/domain/weather/WeatherType$ClearSky;", "Lcom/example/weatherapplication/domain/weather/WeatherType$DenseDrizzle;", "Lcom/example/weatherapplication/domain/weather/WeatherType$DepositingRimeFog;", "Lcom/example/weatherapplication/domain/weather/WeatherType$Foggy;", "Lcom/example/weatherapplication/domain/weather/WeatherType$HeavyRain;", "Lcom/example/weatherapplication/domain/weather/WeatherType$LightDrizzle;", "Lcom/example/weatherapplication/domain/weather/WeatherType$MainlyClear;", "Lcom/example/weatherapplication/domain/weather/WeatherType$ModerateDrizzle;", "Lcom/example/weatherapplication/domain/weather/WeatherType$ModerateRain;", "Lcom/example/weatherapplication/domain/weather/WeatherType$ModerateRainShowers;", "Lcom/example/weatherapplication/domain/weather/WeatherType$Overcast;", "Lcom/example/weatherapplication/domain/weather/WeatherType$PartlyCloudy;", "Lcom/example/weatherapplication/domain/weather/WeatherType$SlightRain;", "Lcom/example/weatherapplication/domain/weather/WeatherType$ViolentRainShowers;", "app_debug"})
public abstract class WeatherType {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String weatherDesc = null;
    private final int iconRes = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.example.weatherapplication.domain.weather.WeatherType.Companion Companion = null;
    
    private WeatherType(java.lang.String weatherDesc, @androidx.annotation.DrawableRes
    int iconRes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWeatherDesc() {
        return null;
    }
    
    public final int getIconRes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$ClearSky;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ClearSky extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.ClearSky INSTANCE = null;
        
        private ClearSky() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$Companion;", "", "()V", "fromWMO", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "code", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.weatherapplication.domain.weather.WeatherType fromWMO(int code) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$DenseDrizzle;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DenseDrizzle extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.DenseDrizzle INSTANCE = null;
        
        private DenseDrizzle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$DepositingRimeFog;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class DepositingRimeFog extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.DepositingRimeFog INSTANCE = null;
        
        private DepositingRimeFog() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$Foggy;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class Foggy extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.Foggy INSTANCE = null;
        
        private Foggy() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$HeavyRain;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class HeavyRain extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.HeavyRain INSTANCE = null;
        
        private HeavyRain() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$LightDrizzle;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class LightDrizzle extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.LightDrizzle INSTANCE = null;
        
        private LightDrizzle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$MainlyClear;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class MainlyClear extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.MainlyClear INSTANCE = null;
        
        private MainlyClear() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$ModerateDrizzle;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateDrizzle extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.ModerateDrizzle INSTANCE = null;
        
        private ModerateDrizzle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$ModerateRain;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateRain extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.ModerateRain INSTANCE = null;
        
        private ModerateRain() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$ModerateRainShowers;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ModerateRainShowers extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.ModerateRainShowers INSTANCE = null;
        
        private ModerateRainShowers() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$Overcast;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class Overcast extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.Overcast INSTANCE = null;
        
        private Overcast() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$PartlyCloudy;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class PartlyCloudy extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.PartlyCloudy INSTANCE = null;
        
        private PartlyCloudy() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$SlightRain;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class SlightRain extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.SlightRain INSTANCE = null;
        
        private SlightRain() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/weatherapplication/domain/weather/WeatherType$ViolentRainShowers;", "Lcom/example/weatherapplication/domain/weather/WeatherType;", "()V", "app_debug"})
    public static final class ViolentRainShowers extends com.example.weatherapplication.domain.weather.WeatherType {
        @org.jetbrains.annotations.NotNull
        public static final com.example.weatherapplication.domain.weather.WeatherType.ViolentRainShowers INSTANCE = null;
        
        private ViolentRainShowers() {
        }
    }
}