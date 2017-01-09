package com.example.gaox.mvpmaster.weather.model;

import android.content.Context;

/**
 * Description :
 * Author : gx
 * Date   : 2015/12/22
 */
public interface WeatherModel {

    void loadWeatherData(String cityName, WeatherModelImpl.LoadWeatherListener listener);

    void loadLocation(Context context, WeatherModelImpl.LoadLocationListener listener);

}
