package com.wp.designmode.observermode.common;

import com.wp.designmode.observermode.common.observer.Observer;
import com.wp.designmode.observermode.common.observer.impl.ConcreteObserver;
import com.wp.designmode.observermode.common.subject.Subject;
import com.wp.designmode.observermode.common.subject.impl.ConcreteSubject;

/**
 * @Classname CommonObserverModeTest
 * @Description 基本观察者模式测试
 * @Date 2021/1/7 11:04
 * @Created by wangpeng116
 */
public class CommonObserverModeTest {
    public static void main(String[] args) {
        //被观察的对象
        Subject subject = new ConcreteSubject();
        //观察者
        Observer observer = new ConcreteObserver();
        subject.attachObserver(observer);
        //被观察对象发布状态更新
        subject.setSubjectState("aaa");
    }
}
