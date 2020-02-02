package com.wp.designmode.cormode.client;

import com.wp.designmode.cormode.handler.PriceHandler;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname Customer
 * @Description 客户
 * @Date 2020/2/2 10:49
 * @Created by wangpeng116
 */
@Slf4j
@Data
public class Customer {

    private PriceHandler priceHandler;

    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }
}
