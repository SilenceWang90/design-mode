package com.wp.designmode.proxymode.staticmode.impl;

import com.wp.designmode.proxymode.staticmode.Movable;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @Classname Car
 * @Description 汽车
 * @Date 2020/2/3 15:22
 * @Created by wangpeng116
 */
@Slf4j
public class Car implements Movable {
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            log.info("汽车行驶中");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
