package com.wp.designmode.proxymode.staticmode.impl;

import com.wp.designmode.proxymode.staticmode.Movable;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Car3
 * @Description 静态代理：聚合方式
 * @Date 2020/2/3 15:40
 * @Created by wangpeng116
 */
@Slf4j
public class Car3 implements Movable {
    private Movable car;

    public Car3(Movable car) {
        this.car = car;
    }
    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        log.info("汽车开始行驶");
        car.move();
        long endtime = System.currentTimeMillis();
        log.info("汽车结束行驶，行驶时间：{}", (endtime - starttime) + "毫秒！");
    }
}
