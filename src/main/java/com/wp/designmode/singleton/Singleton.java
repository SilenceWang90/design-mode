package com.wp.designmode.singleton;

/**
 * @Classname Singleton
 * @Description 单例模式：饿汉模式
 * @Date 2020/1/12 15:21
 * @Created by wangpeng116
 */
public class Singleton {

    //1、将构造方法私有化，不允许外部直接创建对象
    private Singleton() {}

    //2、创建类的唯一实例访问类型是default或者public
    //因为是static类变量，因此最终Singleton类型对象有且只有一个，无论外面写多少个Singleton.instance，
    //这些实例都是指向同一个对象
//    public static Singleton instance = new Singleton();
    private static Singleton instance = new Singleton();

    //3、如果不允许成员变量直接被访问，那么就通过static get方法获取
    public static Singleton getInstance() {
        return instance;
    }
}
