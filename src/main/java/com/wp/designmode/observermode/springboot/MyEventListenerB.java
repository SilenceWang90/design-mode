package com.wp.designmode.observermode.springboot;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author wangpeng
 * @description MyEventListenerB
 * @date 2024/8/9 09:55
 **/
@Component
public class MyEventListenerB {
    @EventListener(condition = "#event.name=='你好'")
    public void say1(MyEvent event) {
        System.out.println("我是注解的形式的监听器1");
    }

    @EventListener(condition = "#event.name=='你好么'")
    @Async
    public void say2(MyEvent event) {
        System.out.println("我是注解的形式的监听器2");
    }

    @EventListener(condition = "#event.name=='hello world'")
    public void say3(MyAnotherEvent event) {
        System.out.println("我监听的是MyAnotherEvent");
        event.read("你好呀");
    }
}
