package com.wp.designmode.cormode.handler.impl;

import com.wp.designmode.cormode.handler.PriceHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Director
 * @Description 总监
 * @Date 2020/2/2 10:44
 * @Created by wangpeng116
 */
@Slf4j
public class Director extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.40) {
            log.info("{}批准了折扣：{}", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
