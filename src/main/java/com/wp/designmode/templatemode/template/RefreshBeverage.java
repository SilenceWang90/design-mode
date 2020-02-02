package com.wp.designmode.templatemode.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname RefreshBeverage
 * @Description 模板基类
 * 为所有子类提供一个算法框架
 * 业务规范是一个提神饮料
 * @Date 2020/2/2 14:04
 * @Created by wangpeng116
 */
@Slf4j
public abstract class RefreshBeverage {

    /**
     * 制备饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     * 不允许子类修改，因为规则由模板规定
     */
    public final void prepareBeverageTemplate() {
        /**步骤1：将水煮沸**/
        boilWater();
        /**步骤2：泡制饮料**/
        brew();
        /**步骤3：将饮料倒入杯中**/
        pourInCup();
        /**步骤4：加入调味料**/
        addContiments();
    }

    /**
     * 基本方法：将水煮沸
     * 子类基本方法，不需要暴露给子类
     */
    private void boilWater() {
        log.info("将水煮沸");
    }

    /**
     * 抽象基本方法：泡制饮料
     * 各个子类可以自定义具体细节
     */
    protected abstract void brew();

    /**
     * 基本方法：将水倒入杯中
     * 子类基本方法，不需要暴露给子类
     */
    private void pourInCup() {
        log.info("将饮料倒入杯中");
    }

    /**
     * 抽象基本方法：添加调料
     * 各个子类可以自定义具体细节
     */
    protected abstract void addContiments();

}
