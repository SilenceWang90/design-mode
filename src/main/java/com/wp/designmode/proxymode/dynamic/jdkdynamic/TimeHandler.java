package com.wp.designmode.proxymode.dynamic.jdkdynamic;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname TimeHandler
 * @Description 时间
 * @Date 2020/2/3 16:12
 * @Created by wangpeng116
 */
@Slf4j
public class TimeHandler implements InvocationHandler {
    private Object target;
    public TimeHandler(Object target){
        super();
        this.target = target;
    }
    /**
     *
     * @param proxy：被代理对象
     * @param method：被代理方法
     * @param args：被代理方法参数
     * @return 生成的代理对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starttime = System.currentTimeMillis();
        log.info("汽车开始行驶");
        method.invoke(target,args);
        long endtime = System.currentTimeMillis();
        log.info("汽车结束行驶，行驶时间：{}", (endtime - starttime) + "毫秒！");
        return null;
    }
}
