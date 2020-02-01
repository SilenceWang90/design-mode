package com.wp.designmode.adaptermode.adapter;

import com.wp.designmode.adaptermode.pluginterface.ThreePlugIf;
import com.wp.designmode.adaptermode.plugs.GBFivePlug;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname FivePlugAdapter
 * @Description 五相转三相适配器
 * @Date 2020/2/1 12:03
 * @Created by wangpeng116
 */
@Slf4j
@Data
public class FivePlugAdapter implements ThreePlugIf {
    private GBFivePlug gbFivePlug;

    public FivePlugAdapter(GBFivePlug gbFivePlug) {
        this.gbFivePlug = gbFivePlug;
    }

    @Override
    public void powerWithThree() {
        log.info("五相转三相");
        gbFivePlug.powerWithFive();
    }
}
