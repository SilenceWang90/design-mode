package com.wp.designmode.abstractfactorymode.factory;

import com.wp.designmode.abstractfactorymode.Boy;
import com.wp.designmode.abstractfactorymode.Girl;
import com.wp.designmode.abstractfactorymode.HNBoy;
import com.wp.designmode.abstractfactorymode.HNGirl;

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
