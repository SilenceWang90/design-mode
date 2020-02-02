package com.wp.designmode.templatemode.template.impl;

import com.wp.designmode.templatemode.template.RefreshBeverage;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Tea
 * @Description 茶
 * @Date 2020/2/2 14:30
 * @Created by wangpeng116
 */
@Slf4j
public class Tea extends RefreshBeverage {
    @Override
    protected void brew() {
        log.info("用80度的热水浸泡茶叶5mins");
    }

    @Override
    protected void addContiments() {
        log.info("加入柠檬");
    }
}
