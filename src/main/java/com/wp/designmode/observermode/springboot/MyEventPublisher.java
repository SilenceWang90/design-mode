package com.wp.designmode.observermode.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * MyEvent事件的发布器
 *
 * @author wangpeng
 * @description MyEventPublisher
 * @date 2024/8/9 09:28
 **/
@Component
@EnableAsync
public class MyEventPublisher {
    // 引入spring事件发布器
    @Autowired
    private ApplicationEventPublisher publisher;

    /**
     * 发布事件
     *
     * @param message
     */
    public void publishEvent(String message) {
        // 创建待发布的事件，给事件填充要发布的内容
        DataObject dataObject = new DataObject();
        dataObject.setCost(BigDecimal.TEN);
        dataObject.setAge(18);
        dataObject.setAddress("北京");
        /** source如果没有特别需要就放入this，即当前的MyEventPublisher类型对象 **/
        MyEvent event = new MyEvent(dataObject, message);
        // 发布事件
        publisher.publishEvent(event);

        /*MyAnotherEvent myAnotherEvent = new MyAnotherEvent("123");
        myAnotherEvent.setName("hello world");
        publisher.publishEvent(myAnotherEvent);
        System.out.println("事件发布完成");*/
    }
}
