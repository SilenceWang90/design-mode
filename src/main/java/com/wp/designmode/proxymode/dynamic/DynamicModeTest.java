package com.wp.designmode.proxymode.dynamic;

import com.wp.designmode.proxymode.dynamic.jdkdynamic.TimeHandler;
import com.wp.designmode.proxymode.staticmode.Movable;
import com.wp.designmode.proxymode.staticmode.impl.Car;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Classname DynamicModeTest
 * @Description 动态代理测试
 * @Date 2020/2/3 15:28
 * @Created by wangpeng116
 */
@Slf4j
public class DynamicModeTest {
    public static void main(String[] args) {
        /**JDK动态代理**/
        Car car = new Car();
        InvocationHandler invocationHandler = new TimeHandler(car);
        Class carClazz = car.getClass();
        /**
         * loader类加载器
         * inteface：要实现的接口
         * handler：事件处理器，自己实现的
         */
        Movable movable = (Movable) Proxy.newProxyInstance(carClazz.getClassLoader(), carClazz.getInterfaces(), invocationHandler);
        movable.move();
        /**CGLIB动态代理**/
    }
}
