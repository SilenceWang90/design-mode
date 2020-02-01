package com.wp.designmode.adaptermode.adapter;

import com.wp.designmode.adaptermode.pluginterface.ThreePlugIf;
import com.wp.designmode.adaptermode.plugs.GBTwoPlug;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname TwoPlugAdapter
 * @Description 二相转三相的适配器
 * @Date 2020/2/1 10:55
 * @Created by wangpeng116
 */
@Slf4j
@Data
public class TwoPlugAdapter implements ThreePlugIf {

    private GBTwoPlug gbTwoPlug;

    public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
        this.gbTwoPlug = gbTwoPlug;
    }

    @Override
    public void powerWithThree() {
        log.info("二相转三相");
        gbTwoPlug.powerWithTwo();
    }
}
