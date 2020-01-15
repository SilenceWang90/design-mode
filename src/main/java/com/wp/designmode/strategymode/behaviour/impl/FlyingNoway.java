package com.wp.designmode.strategymode.behaviour.impl;

import com.wp.designmode.strategymode.behaviour.FlyingStragety;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname FlyingNoway
 * @Description 不会飞行
 * @Date 2020/1/15 19:55
 * @Created by wangpeng116
 */
@Slf4j
public class FlyingNoway implements FlyingStragety {
    @Override
    public void performFly() {
        log.info("我不会飞行！");
    }
}
