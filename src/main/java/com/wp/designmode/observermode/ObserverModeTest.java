package com.wp.designmode.observermode;

import com.wp.designmode.observermode.weather.observer.impl.ConcreteObserver;
import com.wp.designmode.observermode.weather.subject.impl.ConcreteWeatherSubject;

/**
 * @Classname ObserverModeTest
 * @Description 观察者模式测试
 * @Date 2020/1/16 19:50
 * @Created by wangpeng116
 */
public class ObserverModeTest {
    public static void main(String[] args) {
        //1、创建目标
        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();
        //2、创建观察者
        //2.1、观察者1
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("媳妇");
        observerGirl.setRemindThing("第一次约会地点西单见");
        //2.2、观察者2
        ConcreteObserver observerMom = new ConcreteObserver();
        observerMom.setObserverName("妈妈");
        observerMom.setRemindThing("天气好要爬山");
        //3、注册观察者
        weatherSubject.attachObserver(observerGirl);
        weatherSubject.attachObserver(observerMom);
        //4、目标发布天气
        weatherSubject.setWeatherContent("明天天气晴朗，蓝天白云");
    }
}
