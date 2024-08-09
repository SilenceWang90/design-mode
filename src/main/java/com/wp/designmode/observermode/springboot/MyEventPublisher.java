package com.wp.designmode.observermode.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

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

    public void publishEvent(String message) {
        // 创建待发布的事件，给事件填充要发布的内容
        MyEvent event = new MyEvent(this, message);
        // 发布事件
        publisher.publishEvent(event);

        /*MyAnotherEvent myAnotherEvent = new MyAnotherEvent("123");
        myAnotherEvent.setName("hello world");
        publisher.publishEvent(myAnotherEvent);
        System.out.println("事件发布完成");*/
    }
}
