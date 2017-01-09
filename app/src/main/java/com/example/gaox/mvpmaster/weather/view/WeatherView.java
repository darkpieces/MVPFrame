package com.example.gaox.mvpmaster.weather.view;


import com.example.gaox.mvpmaster.beans.WeatherBean;

import java.util.List;


/**
 * Description :
 * Author : gx
 * Date   : 2015/12/22
 */
public interface WeatherView {

    void showProgress();
    void hideProgress();
    void showWeatherLayout();

    void setCity(String city);
    void setToday(String data);
    void setTemperature(String temperature);
    void setWind(String wind);
    void setWeather(String weather);
    void setWeatherImage(int res);
    void setWeatherData(List<WeatherBean> lists);

    void showErrorToast(String msg);


}
