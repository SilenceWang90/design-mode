package com.wp.designmode.observermode.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * @author wangpeng
 * @description spring事件MyEvent
 * @date 2024/8/9 09:25
 **/
@Getter
@Setter
public class MyEvent extends ApplicationEvent {
    private String name;

    /**
     * 事件构造器。父类ApplicationEvent的构造方法要求必须注入Object source。
     * 具体Object source是什么取决于传入的对象，根据需要放入目标对象即可。
     * 该对象一般用于监听者获取事件时可以获取到事件发布时的上下文对象，从而更好的处理事件。
     * 如无特殊需要，Object source对象一般放入事件发布器
     *
     * @param source
     * @param name
     */
    public MyEvent(Object source, String name) {
        super(source);
        this.name = name;
    }


    public String say() {
        System.out.println("我的名字是：" + name);
        return name;
    }

}
