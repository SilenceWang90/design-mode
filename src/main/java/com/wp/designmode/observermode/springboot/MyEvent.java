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
    // 自定义事件的属性
    private String name;
    private Integer code;
    private String data;

    /**
     * 事件构造器，根据需要构建即可～但必须要有Object source。
     * 该属性是父类ApplicationEvent继承而来的，且父类只有一个构造方法就是构造Object source属性，父类ApplicationEvent的构造方法要求必须注入Object source。
     * 具体Object source是什么取决于自定义的事件发布方法MyEventPublisher在调用ApplicationEventPublisher的publishEvent时，构建事件对象MyEvent时传入的对象。
     * 如无特殊需要，Object source对象也可以放入this即自定义的事件发布器。
     *
     * @param source
     */
    public MyEvent(Object source) {
        super(source);
        this.name = name;
    }

    public MyEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public MyEvent(Object source, String name, Integer code, String data) {
        super(source);
        this.name = name;
        this.code = code;
        this.data = data;
    }
}
