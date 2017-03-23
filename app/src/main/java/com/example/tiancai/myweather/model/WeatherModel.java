package com.example.tiancai.myweather.model;

/**
 * Created by Tiancai on 2017/3/23.
 */
//查询天气的接口
public interface WeatherModel {
    //访问环境云API，获取数据
    //@param cityName 要查询城市名称
    //@param litener  得到天气数据后回调接口方法
    void loadWeather(String cityName, OnWeatherLitener litener);

}
