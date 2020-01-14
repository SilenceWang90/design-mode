package com.wp.designmode.decorationmode;

import com.wp.designmode.decorationmode.decoration.impl.Egg;
import com.wp.designmode.decorationmode.decoration.impl.Sugar;
import com.wp.designmode.decorationmode.decoration.impl.WaterMelon;
import com.wp.designmode.decorationmode.product.Drink;
import com.wp.designmode.decorationmode.product.impl.Soya;
import lombok.extern.slf4j.Slf4j;

import com.wp.designmode.decorationmode.decoration.impl.RedBean;
/**
 * @Description 装饰者模式测试
 * @Date 2020/1/14 14:58
 * @Classname DecorationModeTest
 * @Created by wangpeng116
 */
@Slf4j
public class DecorationModeTest {
    public static void main(String[] args) {
        //纯豆浆
        Drink soya = new Soya();
        log.info("纯豆浆价格：{}", soya.money());
        log.info("纯豆浆描述：{}", soya.desc());
        //纯豆浆+红糖
        Drink soyaAndRedBean = new RedBean(soya);
        log.info("纯豆浆+红糖价格：{}", soyaAndRedBean.money());
        log.info("纯豆浆+红糖描述：{}", soyaAndRedBean.desc());
        //纯豆浆+红糖+鸡蛋
        Drink soyaAndRedBeanAndEgg = new Egg(soyaAndRedBean);
        log.info("纯豆浆+红糖+鸡蛋价格：{}", soyaAndRedBeanAndEgg.money());
        log.info("纯豆浆+红糖+鸡蛋描述：{}", soyaAndRedBeanAndEgg.desc());
        //纯豆浆+糖
        Drink soyaAndSugar = new Sugar(soya);
        log.info("纯豆浆+糖价格：{}", soyaAndSugar.money());
        log.info("纯豆浆+糖描述：{}", soyaAndSugar.desc());
        //纯豆浆+西瓜
        Drink soyaAndWaterMelon = new WaterMelon(soya);
        log.info("纯豆浆+西瓜价格：{}", soyaAndWaterMelon.money());
        log.info("纯豆浆+西瓜描述：{}", soyaAndWaterMelon.desc());

    }
}
