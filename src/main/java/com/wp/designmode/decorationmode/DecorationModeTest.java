package com.wp.designmode.decorationmode;

import com.wp.designmode.decorationmode.decoration.impl.RedBean;
import com.wp.designmode.decorationmode.product.Drink;
import com.wp.designmode.decorationmode.product.impl.Soya;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname DecorationModeTest
 * @Description 装饰者模式测试
 * @Date 2020/1/14 14:58
 * @Created by wangpeng116
 */
@Slf4j
public class DecorationModeTest {
    public static void main(String[] args) {
        //纯豆浆
        Drink soya = new Soya();
        log.info("纯豆浆价格：{}", soya.money());
        log.info("纯豆浆描述：{}", soya.desc());
        //加红糖
        Drink soyaAndRedBean = new RedBean(soya);
        log.info("纯豆浆+红糖价格：{}", soyaAndRedBean.money());
        log.info("纯豆浆+红糖描述：{}", soyaAndRedBean.desc());
        //加鸡蛋
    }
}
