package com.wp.designmode.decorationmode.product.impl;

import com.wp.designmode.decorationmode.product.Drink;

import java.math.BigDecimal;

/**
 * @Classname Juice
 * @Description 果汁
 * @Date 2020/1/14 15:53
 * @Created by wangpeng116
 */
public class Juice implements Drink {
    @Override
    public BigDecimal money() {
        return new BigDecimal("6");
    }

    @Override
    public String desc() {
        return "果汁";
    }
}
