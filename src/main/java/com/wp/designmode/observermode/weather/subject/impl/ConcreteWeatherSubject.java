package com.wp.designmode.observermode.weather.subject.impl;

import com.wp.designmode.observermode.weather.subject.WeatherSubject;

/**
 * @Classname ConcreteWeatherSubject
 * @Description 具体天气对象
 * @Date 2020/1/19 19:53
 * @Created by wangpeng116
 */
public class ConcreteWeatherSubject extends WeatherSubject {
    //目标对象的状态
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }
}
