package com.wp.designmode.cormode.handler;

import com.wp.designmode.cormode.handler.impl.*;
import lombok.Data;

/**
 * @Classname PriceHandler
 * @Description 价格处理
 * @Date 2020/2/2 10:26
 * @Created by wangpeng116
 */
@Data
public abstract class PriceHandler {
    protected PriceHandler successor;

    /**
     * 创建责任链
     * 通过工厂方法创建责任链从sale->ceo
     * @return
     */
    public static PriceHandler createPriceHandler() {
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);
        return sales;
    }

    /**
     * 处理客户报价
     *
     * @param discount
     */
    public abstract void processDiscount(float discount);

}
