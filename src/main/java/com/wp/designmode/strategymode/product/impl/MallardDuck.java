package com.wp.designmode.strategymode.product.impl;

import com.wp.designmode.strategymode.behaviour.impl.FlyingWithWings;
import com.wp.designmode.strategymode.product.Duck;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname MallardDuck
 * @Description 野鸭子
 * @Date 2020/1/15 19:14
 * @Created by wangpeng116
 */
@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        /**通过构造函数，对所有使用过MallardDuck的地方注入相同的飞行能力**/
        super.setFlyingStragety(new FlyingWithWings());
    }

    @Override
    public void display() {
        log.info("我的脖子是绿色的");
    }
}
