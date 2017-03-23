package com.example.tiancai.myweather.presenter;

/**
 * Created by Tiancai on 2017/3/23.
 */

public interface ModelPresenter {
    //前台调用该方法去间接调用Model的loadWeather()方法
    //@param cityName  要查询的城市名称
    void getWeather(String cityName);
}
