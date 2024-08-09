package com.wp.designmode.observermode.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author wangpeng
 * @description MyAnotherEvent
 * @date 2024/8/9 11:18
 **/
@Getter
@Setter
public class MyAnotherEvent extends ApplicationEvent {

    private String name;

    public MyAnotherEvent(Object source) {
        super(source);
    }

    public void read(String text) {
        System.out.println("MyAnotherEvent的事件信息为：" + text + name);
    }
}
