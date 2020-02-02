package com.wp.designmode.cormode.handler.impl;

import com.wp.designmode.cormode.handler.PriceHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname CEO
 * @Description CEO
 * @Date 2020/2/2 10:37
 * @Created by wangpeng116
 */
@Slf4j
public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.55) {
            log.info("{}批准了折扣：{}", this.getClass().getName(), discount);
        } else {
            log.info("{}拒绝了折扣：{}", this.getClass().getName(), discount);
        }
    }
}
