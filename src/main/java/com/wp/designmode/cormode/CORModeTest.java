package com.wp.designmode.cormode;

import com.wp.designmode.cormode.client.Customer;
import com.wp.designmode.cormode.handler.PriceHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @Classname CORModeTest
 * @Description 责任链模式测试
 * @Date 2020/2/2 10:06
 * @Created by wangpeng116
 */
@Slf4j
public class CORModeTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandler.createPriceHandler());
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            log.info("{}：", i);
            customer.requestDiscount(random.nextFloat());
        }
    }
}
