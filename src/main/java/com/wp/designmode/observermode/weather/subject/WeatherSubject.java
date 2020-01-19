package com.wp.designmode.observermode.weather.subject;


import com.wp.designmode.observermode.weather.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname WeatherSubject
 * @Description TODO
 * @Date 2020/1/19 19:53
 * @Created by wangpeng116
 */
public class WeatherSubject {
    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册订阅者
     *
     * @param observer
     */
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除订阅者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 只有子类调用
     * 通知方法告知所有订阅者更新行为
     */
    protected void notifyObservers() {
        observers.forEach(obj -> obj.update(this));
    }
}
