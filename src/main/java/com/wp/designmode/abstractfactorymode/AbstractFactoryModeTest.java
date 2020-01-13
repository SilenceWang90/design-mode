package com.wp.designmode.abstractfactorymode;

import com.wp.designmode.abstractfactorymode.factory.FactoryBuilder;
import com.wp.designmode.abstractfactorymode.factory.PersonFactory;
import com.wp.designmode.abstractfactorymode.factory.impl.HNFactory;
import com.wp.designmode.abstractfactorymode.factory.impl.MCFactory;
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
        //创建圣诞工厂
        PersonFactory mcPersonFactory = FactoryBuilder.build(MCFactory.class);
        //创建新年工厂
        PersonFactory hnPersonFactory = FactoryBuilder.build(HNFactory.class);
        //创建圣诞男孩儿
        Boy mcBoy = mcPersonFactory.buildBoy();
        mcBoy.drawMan();
        //创建新年女孩儿
        Girl hnGirl = hnPersonFactory.buildGirl();
        hnGirl.drawWoman();
    }
}
