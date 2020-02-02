package com.wp.designmode.cormode.factory;

import com.wp.designmode.cormode.handler.PriceHandler;
import com.wp.designmode.cormode.handler.impl.*;

/**
 * @Classname PriceHandlerFactory
 * @Description 工厂
 * @Date 2020/2/2 11:18
 * @Created by wangpeng116
 */
public class PriceHandlerFactory {
    /**
     * 创建责任链
     * 通过工厂方法创建责任链从sale->ceo
     *
     * @return
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(lead);
        lead.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);
        return sales;
    }
}
