package com.wp.designmode.proxymode.staticmode.impl;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Car2
 * @Description 代理类：继承方式实现静态代理
 * @Date 2020/2/3 15:31
 * @Created by wangpeng116
 */
@Slf4j
public class Car2 extends Car {
    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        log.info("汽车开始行驶");
        super.move();
        long endtime = System.currentTimeMillis();
        log.info("汽车结束行驶，行驶时间：{}", (endtime - starttime) + "毫秒！");
    }
}
