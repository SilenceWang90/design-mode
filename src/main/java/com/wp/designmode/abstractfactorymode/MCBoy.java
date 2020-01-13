package com.wp.designmode.abstractfactorymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname MCBoy
 * @Description 圣诞节男孩儿装扮
 * @Date 2020/1/13 19:37
 * @Created by wangpeng116
 */
@Slf4j
public class MCBoy implements Boy {
    @Override
    public void drawMan() {
        log.info("-----------------圣诞系列男孩儿-----------------");
    }
}
