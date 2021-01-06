package com.wp.designmode.decorationmode.decoration.impl;

import com.wp.designmode.decorationmode.decoration.Decorator;
import com.wp.designmode.decorationmode.product.Drink;

import java.math.BigDecimal;

/**
 * @Classname RedBean
 * @Description 装饰品：红豆
 * @Date 2020/1/14 15:13
 * @Created by wangpeng116
 */
public class RedBean extends Decorator {
    public RedBean(Drink drink) {
        super(drink);
    }

    /**
     * 重写价格
     *
     * @return
     */
    @Override
    public BigDecimal money() {
        return drink.money().add(new BigDecimal("3.2"));
    }

    /**
     * 重写描述
     *
     * @return
     */
    @Override
    public String desc() {
        return drink.desc() + "+红豆";
    }
}
