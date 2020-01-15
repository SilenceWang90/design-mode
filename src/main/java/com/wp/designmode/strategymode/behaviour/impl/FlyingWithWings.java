package com.wp.designmode.strategymode.behaviour.impl;

import com.wp.designmode.strategymode.behaviour.FlyingStragety;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname FlyingWithWings
 * @Description 用翅膀飞行
 * @Date 2020/1/15 19:40
 * @Created by wangpeng116
 */
@Slf4j
public class FlyingWithWings implements FlyingStragety {
    @Override
    public void performFly() {
        log.info("振翅高飞");
    }
}
