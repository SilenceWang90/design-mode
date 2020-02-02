package com.wp.designmode.cormode.handler.impl;

import com.wp.designmode.cormode.handler.PriceHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Sales
 * @Description 销售人员，可以批准5%以内的折扣
 * @Date 2020/2/2 10:31
 * @Created by wangpeng116
 */
@Slf4j
public class Sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.05) {
            log.info("{}批准了折扣：{}", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
