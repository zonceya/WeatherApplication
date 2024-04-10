package com.example.weatherapplication;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WeatherApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface WeatherApp_GeneratedInjector {
  void injectWeatherApp(WeatherApp weatherApp);
}
