package com.wp.designmode.factorymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname HairFactory
 * @Description 发型工厂
 * @Date 2020/1/13 18:59
 * @Created by wangpeng116
 */
@Slf4j
public class HairFactory {
    /**
     * 根据传入类型来创建对象：以下写法不建议使用，因为每增加一种类型，工厂就要增加一次case
     *
     * @param key
     * @return
     */
    public HairInterface getHair(String key) {
        HairInterface hairInterface;
        switch (key) {
            case "left":
                hairInterface = new LeftHair();
                break;
            case "right":
                hairInterface = new RightHair();
                break;
            default:
                hairInterface = null;
                break;
        }
        return hairInterface;
    }

    /**
     * 根据类类型来生产对象
     * @param hairInterfaceClazz
     * @return
     */
    public HairInterface buildHair(Class hairInterfaceClazz){
        HairInterface hairInterface = null;
        try {
            hairInterface = (HairInterface)hairInterfaceClazz.newInstance();
        } catch (InstantiationException e) {
            log.error("初始化对象异常：{}",e);
        } catch (IllegalAccessException e) {
            log.error("访问权限异常：{}",e);
        }
        return hairInterface;
    }



}
