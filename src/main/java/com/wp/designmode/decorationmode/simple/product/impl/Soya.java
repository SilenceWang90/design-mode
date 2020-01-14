package com.wp.designmode.decorationmode.simple.product.impl;

import com.wp.designmode.decorationmode.simple.product.Drink;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @Classname Soya
 * @Description 被装饰者：豆浆
 * @Date 2020/1/14 15:01
 * @Created by wangpeng116
 */
@Slf4j
public class Soya implements Drink {
    @Override
    public BigDecimal money() {
        return new BigDecimal(5);
    }

    @Override
    public String desc() {
        return "纯豆浆";
    }
}
