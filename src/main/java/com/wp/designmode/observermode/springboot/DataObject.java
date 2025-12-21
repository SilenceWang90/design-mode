package com.wp.designmode.observermode.springboot;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wangpeng
 * @description 发布事件要传递的对象
 * @date 2025/12/21 09:56
 **/
@Data
public class DataObject {
    private String address;
    private Integer age;
    private BigDecimal cost;
}
