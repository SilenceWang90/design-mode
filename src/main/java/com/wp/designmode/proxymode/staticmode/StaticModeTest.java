package com.wp.designmode.proxymode.staticmode;

import com.wp.designmode.proxymode.staticmode.impl.Car;
import com.wp.designmode.proxymode.staticmode.impl.Car2;
import com.wp.designmode.proxymode.staticmode.impl.Car3;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname StaticModeTest
 * @Description 静态代理测试
 * @Date 2020/2/3 15:28
 * @Created by wangpeng116
 */
@Slf4j
public class StaticModeTest {
    public static void main(String[] args) {
        /**1、继承方式实现静态代理**/
        Movable car2 = new Car2();
        car2.move();
        System.out.println("--------------------------");
        /**2、聚合方式实现静态代理**/
        Car car = new Car();
        Movable car3 = new Car3(car);
        car3.move();
    }
}
