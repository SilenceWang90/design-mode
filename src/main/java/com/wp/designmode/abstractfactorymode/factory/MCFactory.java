package com.wp.designmode.abstractfactorymode.factory;

import com.wp.designmode.abstractfactorymode.Boy;
import com.wp.designmode.abstractfactorymode.Girl;
import com.wp.designmode.abstractfactorymode.MCBoy;
import com.wp.designmode.abstractfactorymode.MCGirl;

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
