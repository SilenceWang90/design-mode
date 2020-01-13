package com.wp.designmode.factorymode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Classname RightHair
 * @Description 右偏分发型
 * @Date 2020/1/13 18:51
 * @Created by wangpeng116
 */
@Slf4j
public class RightHair implements HairInterface {
    /**
     * 画了一个右偏分发型
     */
    @Override
    public void draw() {
        log.info("--------------------右偏分发型----------------------");
    }
}
