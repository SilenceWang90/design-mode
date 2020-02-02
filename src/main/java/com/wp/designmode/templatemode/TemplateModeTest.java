package com.wp.designmode.templatemode;

import com.wp.designmode.templatemode.template.RefreshBeverage;
import com.wp.designmode.templatemode.template.impl.Coffee;
import com.wp.designmode.templatemode.template.impl.Tea;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname TemplateModeTet
 * @Description 测试类
 * @Date 2020/2/2 14:00
 * @Created by wangpeng116
 */
@Slf4j
public class TemplateModeTest {
    public static void main(String[] args) {
        log.info("start制备咖啡");
        RefreshBeverage coffee = new Coffee();
        coffee.prepareBeverageTemplate();
        log.info("finish制备咖啡");
        System.out.println("--------------------------------------");
        log.info("start制备茶");
        RefreshBeverage tea = new Tea();
        tea.prepareBeverageTemplate();
        log.info("finish制备茶");
    }
}
