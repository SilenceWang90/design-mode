package com.wp.designmode.observermode.springboot;

import org.springframework.context.event.EventListener;
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
    public void say2(MyEvent event) {
        System.out.println("我是注解的形式的监听器2");
    }
}
