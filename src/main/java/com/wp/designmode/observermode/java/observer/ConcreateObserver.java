package com.wp.designmode.observermode.java.observer;

import com.wp.designmode.observermode.java.subject.ConcreteWeatherSubject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * @Classname ConcreateObserver
 * @Description 观察者
 * @Date 2020/1/30 11:00
 * @Created by wangpeng116
 */
@Data
@Slf4j
public class ConcreateObserver implements Observer {
    private String observerName;
    /**
     *
     * @param o：拉取方式拉取得对象
     * @param arg：推送方式推送的信息，就是传参
     */
    @Override
    public void update(Observable o, Object arg) {
        log.info("推送方式，{}收到了消息，目标对象推送的信息为：{}",observerName,((ConcreteWeatherSubject)o).getContent());
        log.info("拉取方式，{}收到了消息，主动拉取的内容为：{}",
                observerName,((ConcreteWeatherSubject)o).getContent());
    }
}
