package com.wp.designmode.factorymode;

import com.wp.designmode.factorymode.factory.HairFactory;
import com.wp.designmode.factorymode.hair.HairInterface;
import com.wp.designmode.factorymode.hair.impl.LeftHair;
import com.wp.designmode.factorymode.hair.impl.RightHair;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname FactoryModeTest
 * @Description 工厂模式测试
 * @Date 2020/1/13 18:53
 * @Created by wangpeng116
 */
@Slf4j
public class FactoryModeTest {
    public static void main(String[] args) {
        //1、正常写法：以下写法造成的缺陷：每增加一个发型，就需要显式声明一个类型的对象进行调用，不利于维护和调用
        /*HairInterface leftHair = new LeftHair();
        leftHair.draw();
        HairInterface rightHair = new RightHair();
        rightHair.draw();*/
        //2.1、工厂模式简化写法：缺陷，每增加一个类型，工厂类也需要维护该类型对象的生成
        /*HairFactory hairFactory = new HairFactory();
        HairInterface leftHair = hairFactory.getHair("left");
        leftHair.draw();
        HairInterface rightHair = hairFactory.getHair("right");
        rightHair.draw();*/
        //2.2、工厂模式优化：通过类型反射方式创建对象
        HairFactory hairFactory = new HairFactory();
        HairInterface leftHair = hairFactory.buildHair(LeftHair.class);
        leftHair.draw();
        HairInterface rightHair = hairFactory.buildHair(RightHair.class);
        rightHair.draw();
    }
}
