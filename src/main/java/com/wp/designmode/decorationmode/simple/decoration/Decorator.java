package com.wp.designmode.decorationmode.simple.decoration;

import com.wp.designmode.decorationmode.simple.product.Drink;

import java.math.BigDecimal;

/**
 * @Classname Decorator
 * @Description 装饰器
 * @Date 2020/1/14 15:06
 * @Created by wangpeng116
 */
public abstract class Decorator implements Drink {
    private Drink drink;

    /**
     * 通过构造函数传入产品类型的引用
     *
     * @param drink
     */
    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public BigDecimal money() {
        return drink.money();
    }

    @Override
    public String desc() {
        return drink.desc();
    }
}
