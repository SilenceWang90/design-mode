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
     * 处理客户报价
     *
     * @param discount
     */
    public abstract void processDiscount(float discount);

}
