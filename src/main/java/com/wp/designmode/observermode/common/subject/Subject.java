package com.wp.designmode.observermode.common.subject;

import com.wp.designmode.observermode.common.observer.Observer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Subject
 * @Description 目标对象，他知道他的观察者，并提供注册和删除观察者的接口
 * @Date 2020/1/16 20:03
 * @Created by wangpeng116
 */
@Data
public class Subject {
    //观察者需要观察的内容
    protected String subjectState;

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
    protected void notifyObservers(){
        observers.forEach(obj -> obj.update(this));
    }

}
