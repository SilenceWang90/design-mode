package com.wp.designmode.decorationmode.simple.decoration.impl;

import com.wp.designmode.decorationmode.simple.decoration.Decorator;
import com.wp.designmode.decorationmode.simple.product.Drink;

import java.math.BigDecimal;

/**
 * @Classname Egg
 * @Description 装饰品：鸡蛋
 * @Date 2020/1/14 15:19
 * @Created by wangpeng116
 */
public class Egg extends Decorator {
    public Egg(Drink drink) {
        super(drink);
    }

    /**
     * 重写价格
     *
     * @return
     */
    @Override
    public BigDecimal money() {
        return super.money().add(new BigDecimal("3.9"));
    }

    /**
     * 重写描述
     *
     * @return
     */
    @Override
    public String desc() {
        return super.desc() + "+鸡蛋";
    }
}
