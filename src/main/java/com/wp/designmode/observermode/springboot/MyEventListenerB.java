package com.wp.designmode.observermode.springboot;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author wangpeng
 * @description MyEventListenerB
 * @date 2024/8/9 09:55
 **/
@Component
public class MyEventListenerB {

    /**
     * 事件对象类型为MyEvent，并且，MyEvent的name属性如果为"你好"字符串时，该方法被调用
     * 注意：可以不用在EventListener中通过value或者classes属性声明要监听的事件类型，参数类型即相当于声明了要监听的事件类型。
     * 如果使用value或者classes属性声明要监听的事件类型，那么一定要和参数的类型一致，spring调用时会报错类型匹配
     * @param event
     */
    @EventListener(value = {MyEvent.class}, condition = "#event.name=='你好'")
    public void say1(MyEvent event) {
        System.out.println("我是注解的形式的监听器1");
        DataObject dataObject = (DataObject) event.getSource();
        System.out.println("我是注解的形式的监听器1，name为：" + event.getName());
        System.out.println("我是注解的形式的监听器1：dataObject为：" + dataObject);
    }

    /**
     * 事件对象类型为MyEvent，并且，MyEvent的name属性如果为"你好么"字符串时，该方法被调用
     * 注意：可以不用在EventListener中通过value或者classes属性声明要监听的事件类型，参数类型即相当于声明了要监听的事件类型。
     * 如果使用value或者classes属性声明要监听的事件类型，那么一定要和参数的类型一致，spring调用时会报错类型匹配
     * @param event
     */
    @EventListener(condition = "#event.name=='你好么'")
    @Async
    public void say2(MyEvent event) {
        System.out.println("我是注解的形式的监听器2");
        DataObject dataObject = (DataObject) event.getSource();
        System.out.println("我是注解的形式的监听器2，name为：" + event.getName());
        System.out.println("我是注解的形式的监听器2：dataObject为：" + dataObject);
    }

    @EventListener(condition = "#event.name=='hello world'")
    public void say3(MyAnotherEvent event) {
        System.out.println("我监听的是MyAnotherEvent");
        event.read("你好呀");
    }
}
