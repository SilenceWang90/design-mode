package com.wp.designmode.proxymode.dynamic.cglibdynamic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Classname CglibProxy
 * @Description Cglib代理
 * @Date 2020/2/3 16:47
 * @Created by wangpeng116
 */
@Slf4j
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    /**
     * 获取代理类
     * @param clazz
     * @return
     */
    public Object getProxy(Class clazz){
        //生成子类：为哪个类生成代理类
        enhancer.setSuperclass(clazz);
        //设置回调对象
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 描述：拦截所有目标类方法的调用
     *
     * @param o：目标类实例
     * @param method：目标方法
     * @param objects：方法参数
     * @param methodProxy：代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("日志开始...");
        //代理类调用父类的方法
        methodProxy.invokeSuper(o, objects);
        log.info("日志结束...");
        return null;
    }
}
