package com.wp.designmode.decorationmode.simple.decoration.impl;

import com.wp.designmode.decorationmode.simple.decoration.Decorator;
import com.wp.designmode.decorationmode.simple.product.Drink;

import java.math.BigDecimal;

/**
 * @Classname Sugar
 * @Description 装饰品：糖
 * @Date 2020/1/14 15:21
 * @Created by wangpeng116
 */
public class Sugar extends Decorator {

    public Sugar(Drink drink) {
        super(drink);
    }

    /**
     * 重写价格
     *
     * @return
     */
    @Override
    public BigDecimal money() {
        return super.money().add(new BigDecimal("2.1"));
    }

    /**
     * 重写描述
     *
     * @return
     */
    @Override
    public String desc() {
        return super.desc() + "+糖";
    }
}
