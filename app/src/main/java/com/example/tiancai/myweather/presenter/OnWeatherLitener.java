package com.example.tiancai.myweather.presenter;

/**
 * Created by Tiancai on 2017/3/23.
 */

public interface OnWeatherLitener {
    //成功时回调该方法
    // @param weather
    void onSucess(Weather weather);
    //失败时调用
    void onFiled();
}
