package com.example.tiancai.myweather.view;

/**
 * Created by Tiancai on 2017/3/23.
 */

public interface WeatherView {
    //显示进度条
    void showLoading();
    //隐藏进度条
    void dismissLoading();
    //显示更新失败
    void showError();
    //更新UI
    void  setWeatherInfo(Weather weather);
}

