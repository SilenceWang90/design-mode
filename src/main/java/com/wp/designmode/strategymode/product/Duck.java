package com.wp.designmode.strategymode.product;

import com.wp.designmode.strategymode.behaviour.FlyingStragety;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Duck
 * @Description Duck，所有鸭子都要继承此类
 * 抽象了鸭子的行为：显示和鸣叫
 * @Date 2020/1/15 19:11
 * @Created by wangpeng116
 */
@Slf4j
public abstract class Duck {

    private FlyingStragety flyingStragety;

    /**
     * 鸭子发出叫声
     * 通用行为，由超类实现
     */
    public void quack() {
        log.info("嘎嘎嘎");
    }

    /**
     * 显示鸭子的外观
     * 鸭子的外观各不相同，声明为abstract
     */
    public abstract void display();

    /**
     * 提供鸭子飞行能力
     */
    public void fly() {
        flyingStragety.performFly();
    }

    public FlyingStragety getFlyingStragety() {
        return flyingStragety;
    }

    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }
}
