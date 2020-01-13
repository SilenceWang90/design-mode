package com.wp.designmode.abstractfactorymode.factory.impl;

import com.wp.designmode.abstractfactorymode.factory.PersonFactory;
import com.wp.designmode.abstractfactorymode.product.Boy;
import com.wp.designmode.abstractfactorymode.product.Girl;
import com.wp.designmode.abstractfactorymode.product.impl.MCBoy;
import com.wp.designmode.abstractfactorymode.product.impl.MCGirl;

/**
 * @Classname MCFactory
 * @Description 圣诞系列创建工厂
 * @Date 2020/1/13 19:42
 * @Created by wangpeng116
 */
public class MCFactory implements PersonFactory {
    @Override
    public Boy buildBoy() {
        return new MCBoy();
    }

    @Override
    public Girl buildGirl() {
        return new MCGirl();
    }
}
