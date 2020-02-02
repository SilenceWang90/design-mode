package com.wp.designmode.cormode.handler.impl;

import com.wp.designmode.cormode.handler.PriceHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Lead
 * @Description lead
 * @Date 2020/2/2 11:13
 * @Created by wangpeng116
 */
@Slf4j
public class Lead extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.15) {
            log.info("{}批准了折扣：{}", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
