package com.wp.designmode.templatemode.template.impl;

import com.wp.designmode.templatemode.template.RefreshBeverage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Coffee
 * @Description 制作咖啡
 * @Date 2020/2/2 14:24
 * @Created by wangpeng116
 */
@Slf4j
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        log.info("用沸水冲泡咖啡");
    }

    @Override
    protected void addContiments() {
        log.info("加入糖和牛奶");
    }
}
