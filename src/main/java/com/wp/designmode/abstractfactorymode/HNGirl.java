package com.wp.designmode.abstractfactorymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname HNGirl
 * @Description 新年女孩儿装扮
 * @Date 2020/1/13 19:36
 * @Created by wangpeng116
 */
@Slf4j
public class HNGirl implements Girl {
    @Override
    public void drawWoman() {
        log.info("-----------------新年系列女孩儿-----------------");
    }
}
