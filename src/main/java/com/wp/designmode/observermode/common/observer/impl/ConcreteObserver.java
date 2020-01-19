package com.wp.designmode.observermode.common.observer.impl;

import com.wp.designmode.observermode.common.observer.Observer;
import com.wp.designmode.observermode.common.subject.Subject;
import com.wp.designmode.observermode.common.subject.impl.ConcreteSubject;
import lombok.Data;

/**
 * @Classname ConcreteObserver
 * @Description 具体的观察者对象，实现更新的方法，使自身状态和目标状态一致
 * @Date 2020/1/16 20:07
 * @Created by wangpeng116
 */
@Data
public class ConcreteObserver implements Observer {

    //观察者的状态
    private String observerState;

    /**
     * 获取目标类的状态同步到观察者的状态中
     *
     * @param subject 传入目标对象，方便获取相应目标对象的状态
     */
    @Override
    public void update(Subject subject) {
        this.observerState = ((ConcreteSubject) subject).getSubjectState();
    }
}
