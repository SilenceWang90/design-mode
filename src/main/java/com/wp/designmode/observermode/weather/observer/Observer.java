package com.wp.designmode.observermode.weather.observer;

import com.wp.designmode.observermode.weather.subject.WeatherSubject;

/**
 * @Classname Observer
 * @Description TODO
 * @Date 2020/1/19 19:54
 * @Created by wangpeng116
 */
public interface Observer {
    /**
     * 更新的接口
     *
     * @param subject 传入目标对象，方便获取相应目标对象的状态
     */
    void update(WeatherSubject subject);
}
