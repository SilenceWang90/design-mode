package com.wp.designmode.observermode.java;

import com.wp.designmode.observermode.java.observer.ConcreateObserver;
import com.wp.designmode.observermode.java.subject.ConcreteWeatherSubject;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname JavaObserverModeTest
 * @Description java观察者模式的测试
 * @Date 2020/1/30 11:09
 * @Created by wangpeng116
 */
@Slf4j
public class JavaObserverModeTest {
    public static void main(String[] args) {
        //1、创建目标对象
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //2、创建观察者
        ConcreateObserver girl = new ConcreateObserver();
        girl.setObserverName("媳妇");
        ConcreateObserver mom = new ConcreateObserver();
        mom.setObserverName("老妈");
        //3、观察者订阅目标对象
        subject.addObserver(girl);
        subject.addObserver(mom);
        //4、目标对象更新，通知已注册的观察者
        subject.setContent("天气晴朗");
    }
}
