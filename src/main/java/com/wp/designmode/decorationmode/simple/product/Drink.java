package com.wp.designmode.decorationmode.simple.product;

import java.math.BigDecimal;

/**
 * @Classname Drink
 * @Description 抽象组件：饮品
 * @Date 2020/1/14 14:58
 * @Created by wangpeng116
 */
public interface Drink {
    /**
     * 获取价格
     *
     * @return
     */
    BigDecimal money();

    /**
     * 获取品种描述
     */
    String desc();
}
