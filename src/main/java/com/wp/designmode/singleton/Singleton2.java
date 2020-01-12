package com.wp.designmode.singleton;

/**
 * @Classname Singleton2
 * @Description 单例模式：懒汉模式
 * @Date 2020/1/12 15:46
 * @Created by wangpeng116
 */
public class Singleton2 {
    //1、私有化构造方法
    private Singleton2() {
    }

    //2、创建类的唯一实例，使用private static修饰
    private static Singleton2 instance;

    //3、提供一个用于获取实例的方法，使用public static修饰
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }


}
