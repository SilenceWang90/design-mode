package com.wp.designmode.decorationmode.decoration;

import com.wp.designmode.decorationmode.product.Drink;

import java.math.BigDecimal;

/**
 * @Classname Decorator
 * @Description 装饰器
 * @Date 2020/1/14 15:06
 * @Created by wangpeng116
 */
public abstract class Decorator implements Drink {
    //用于子类继承，装饰器就是对被装饰者进行装饰
    protected Drink drink;

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
