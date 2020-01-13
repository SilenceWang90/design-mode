package com.wp.designmode.abstractfactorymode.factory.impl;

import com.wp.designmode.abstractfactorymode.factory.PersonFactory;
import com.wp.designmode.abstractfactorymode.product.Boy;
import com.wp.designmode.abstractfactorymode.product.Girl;
import com.wp.designmode.abstractfactorymode.product.impl.HNBoy;
import com.wp.designmode.abstractfactorymode.product.impl.HNGirl;

/**
 * @Classname HNFactory
 * @Description 新年系列创建工厂
 * @Date 2020/1/13 19:42
 * @Created by wangpeng116
 */
public class HNFactory implements PersonFactory {
    @Override
    public Boy buildBoy() {
        return new HNBoy();
    }

    @Override
    public Girl buildGirl() {
        return new HNGirl();
    }
}
