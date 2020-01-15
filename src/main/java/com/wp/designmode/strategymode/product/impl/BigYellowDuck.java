package com.wp.designmode.strategymode.product.impl;

import com.wp.designmode.strategymode.behaviour.impl.FlyingNoway;
import com.wp.designmode.strategymode.product.Duck;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname BigYellowDuck
 * @Description 大黄鸭
 * @Date 2020/1/15 20:10
 * @Created by wangpeng116
 */
@Slf4j
public class BigYellowDuck extends Duck {
    public BigYellowDuck() {
        super();
        super.setFlyingStragety(new FlyingNoway());
    }

    @Override
    public void quack() {
        log.info("我不会说话");
    }

    @Override
    public void display() {
        log.info("我身体很大，全身黄黄");
    }
}
