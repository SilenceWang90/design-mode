package com.wp.designmode.observermode.java.subject;

import java.util.Observable;

/**
 * @Classname ConcreteWeatherSubject
 * @Description 天气目标具体实现类
 * @Date 2020/1/30 10:46
 * @Created by wangpeng116
 */
public class ConcreteWeatherSubject extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        /**通知所有观察者**/
        //1、对象是否发生改变，不调用此方法则无法通知观察者
        this.setChanged();
        //2、通知观察者
        /**推模型：推送具体的内容**/
//        this.notifyObservers(content);
        /**拉模型：拉取所有信息，将Subject**/
        this.notifyObservers();
    }
}
