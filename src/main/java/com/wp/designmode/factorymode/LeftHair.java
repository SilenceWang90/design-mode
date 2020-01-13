package com.wp.designmode.factorymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname LeftHair
 * @Description 左偏分发型
 * @Date 2020/1/13 18:48
 * @Created by wangpeng116
 */
@Slf4j
public class LeftHair implements HairInterface {
    /**
     * 画了一个左偏分发型
     */
    @Override
    public void draw() {
        log.info("--------------------左偏分发型----------------------");
    }
}
