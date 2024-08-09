package com.wp.designmode.observermode.springboot;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author wangpeng
 * @description MyEventListener
 * @date 2024/8/9 09:32
 **/
@Component
public class MyEventListenerA implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("我是接口实现方式的监听器：" + event.getName());
    }
}
