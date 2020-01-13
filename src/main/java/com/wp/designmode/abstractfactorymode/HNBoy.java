package com.wp.designmode.abstractfactorymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname HNBoy
 * @Description 新年男孩儿装扮
 * @Date 2020/1/13 19:37
 * @Created by wangpeng116
 */
@Slf4j
public class HNBoy implements Boy {
    @Override
    public void drawMan() {
        log.info("-----------------新年系列男孩儿-----------------");
    }
}
