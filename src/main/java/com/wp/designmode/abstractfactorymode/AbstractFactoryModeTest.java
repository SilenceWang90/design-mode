package com.wp.designmode.abstractfactorymode;

import com.wp.designmode.abstractfactorymode.factory.impl.HNFactory;
import com.wp.designmode.abstractfactorymode.factory.impl.MCFactory;
import com.wp.designmode.abstractfactorymode.factory.PersonFactory;
import com.wp.designmode.abstractfactorymode.product.Boy;
import com.wp.designmode.abstractfactorymode.product.Girl;

/**
 * @Classname AbstractFactoryModeTest
 * @Description 抽象工厂测试
 * @Date 2020/1/13 19:47
 * @Created by wangpeng116
 */
public class AbstractFactoryModeTest {
    public static void main(String[] args) {
        PersonFactory mcPersonFactory = new MCFactory();
        Girl girl = mcPersonFactory.buildGirl();
        girl.drawWoman();

        PersonFactory hnPersonFactory = new HNFactory();
        Boy boy = hnPersonFactory.buildBoy();
        boy.drawMan();
    }
}
