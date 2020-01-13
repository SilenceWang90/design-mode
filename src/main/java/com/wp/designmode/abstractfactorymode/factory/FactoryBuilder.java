package com.wp.designmode.abstractfactorymode.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname FactoryBuilder
 * @Description 创建工厂
 * @Date 2020/1/13 20:08
 * @Created by wangpeng116
 */
@Slf4j
public class FactoryBuilder {
    public static PersonFactory build(Class fatoryClazz){
        PersonFactory personFactory = null;
        try {
            personFactory = (PersonFactory)fatoryClazz.newInstance();
        } catch (InstantiationException e) {
            log.error("初始化工厂对象异常：{}",e);
        } catch (IllegalAccessException e) {
            log.error("创建工厂访问权限异常：{}",e);
        }
        return personFactory;
    }
}
