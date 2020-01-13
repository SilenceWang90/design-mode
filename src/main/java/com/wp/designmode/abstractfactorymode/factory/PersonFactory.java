package com.wp.designmode.abstractfactorymode.factory;

import com.wp.designmode.abstractfactorymode.Boy;
import com.wp.designmode.abstractfactorymode.Girl;

/**
 * @Classname PersonFactory
 * @Description 人物实现接口
 * @Date 2020/1/13 19:40
 * @Created by wangpeng116
 */
public interface PersonFactory {
    /**
     * 男孩儿装扮接口
     *
     * @return
     */
    Boy buildBoy();

    /**
     * 女孩儿装扮接口
     *
     * @return
     */
    Girl buildGirl();
}
