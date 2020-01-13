package com.wp.designmode.abstractfactorymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname MCGirl
 * @Description 圣诞节女孩儿装扮
 * @Date 2020/1/13 19:35
 * @Created by wangpeng116
 */
@Slf4j
public class MCGirl implements Girl {
    @Override
    public void drawWoman() {
        log.info("-----------------圣诞系列女孩儿-----------------");
    }
}
