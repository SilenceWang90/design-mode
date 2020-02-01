package com.wp.designmode.adaptermode.adapter;

import com.wp.designmode.adaptermode.pluginterface.ThreePlugIf;
import com.wp.designmode.adaptermode.plugs.GBEightPlug;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname EightPlugAdapter
 * @Description 继承+实现接口
 * @Date 2020/2/1 13:14
 * @Created by wangpeng116
 */
@Slf4j
public class EightPlugAdapter extends GBEightPlug
        implements ThreePlugIf {
    @Override
    public void powerWithThree() {
        log.info("通过继承方式进行八相插口转换");
        this.powerWithEight();
    }
}
