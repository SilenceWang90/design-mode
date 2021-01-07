package com.wp.designmode.observermode.common.subject.impl;

import com.wp.designmode.observermode.common.subject.Subject;

/**
 * @Classname ConcreteSubject
 * @Description 具体的目标对象，负责把有关状态存入到相应的观察者模式中
 * @Date 2020/1/16 20:05
 * @Created by wangpeng116
 */
public class ConcreteSubject extends Subject {

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
