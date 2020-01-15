package com.wp.designmode.strategymode.product.impl;

import com.wp.designmode.strategymode.behaviour.impl.FlyingNoway;
import com.wp.designmode.strategymode.product.Duck;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname RubberDuck
 * @Description 橡胶鸭子
 * @Date 2020/1/15 19:57
 * @Created by wangpeng116
 */
@Slf4j
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        super.setFlyingStragety(new FlyingNoway());
    }

    @Override
    public void quack() {
        log.info("嘎~嘎~嘎~");
    }

    @Override
    public void display() {
        log.info("我全身发黄，嘴巴很红");

    }

}
