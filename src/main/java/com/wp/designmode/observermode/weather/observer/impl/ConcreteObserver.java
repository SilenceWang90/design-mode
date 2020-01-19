package com.wp.designmode.observermode.weather.observer.impl;

import com.wp.designmode.observermode.weather.observer.Observer;
import com.wp.designmode.observermode.weather.subject.WeatherSubject;
import com.wp.designmode.observermode.weather.subject.impl.ConcreteWeatherSubject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname ConcreteObserver
 * @Description TODO
 * @Date 2020/1/19 19:54
 * @Created by wangpeng116
 */
@Data
@Slf4j
public class ConcreteObserver implements Observer {
    private String observerName;

    private String weatherContent;

    private String remindThing;

    /**
     * 获取目标类的状态同步到观察者的状态中
     *
     * @param subject 传入目标对象，方便获取相应目标对象的状态
     */
    @Override
    public void update(WeatherSubject subject) {
        this.weatherContent = ((ConcreteWeatherSubject) subject).getWeatherContent();
        log.info("观察者{}收到了：{},{}", observerName, weatherContent, remindThing);
    }

}
