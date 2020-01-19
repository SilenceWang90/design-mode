package com.wp.designmode.observermode.common.observer;

import com.wp.designmode.observermode.common.subject.Subject;

/**
 * @Classname Observer
 * @Description 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @Date 2020/1/16 20:06
 * @Created by wangpeng116
 */
public interface Observer {
    /**
     * 更新的接口
     *
     * @param subject 传入目标对象，方便获取相应目标对象的状态
     */
    void update(Subject subject);
}
