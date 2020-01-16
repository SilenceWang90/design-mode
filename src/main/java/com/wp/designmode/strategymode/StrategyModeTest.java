package com.wp.designmode.strategymode;

import com.wp.designmode.strategymode.product.Duck;
import com.wp.designmode.strategymode.product.impl.MallardDuck;
import com.wp.designmode.strategymode.product.impl.RedheadDuck;
import com.wp.designmode.strategymode.product.impl.RubberDuck;

/**
 * @Classname StrategyModeTest
 * @Description 策略模式测试
 * @Date 2020/1/15 19:33
 * @Created by wangpeng116
 */
public class StrategyModeTest {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();
        mallardDuck.fly();
        redheadDuck.fly();
        rubberDuck.fly();
    }
}
