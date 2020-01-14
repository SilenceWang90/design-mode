package com.wp.designmode.decorationmode.decoration.impl;

import com.wp.designmode.decorationmode.decoration.Decorator;
import com.wp.designmode.decorationmode.product.Drink;

import java.math.BigDecimal;

/**
 * @Classname WaterMelon
 * @Description 装饰品：西瓜
 * @Date 2020/1/14 15:48
 * @Created by wangpeng116
 */
public class WaterMelon extends Decorator {
    public WaterMelon(Drink drink) {
        super(drink);
    }

    @Override
    public BigDecimal money() {
        return super.money().add(new BigDecimal("4"));
    }

    @Override
    public String desc() {
        return super.desc() + "+西瓜";
    }
}
