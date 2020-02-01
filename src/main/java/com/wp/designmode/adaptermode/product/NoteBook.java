package com.wp.designmode.adaptermode.product;

import com.wp.designmode.adaptermode.adapter.TwoPlugAdapter;
import com.wp.designmode.adaptermode.pluginterface.ThreePlugIf;
import com.wp.designmode.adaptermode.plugs.GBTwoPlug;
import lombok.extern.slf4j.Slf4j;

/**
 * @Classname NoteBook
 * @Description 笔记本
 * @Date 2020/2/1 10:46
 * @Created by wangpeng116
 */
@Slf4j
public class NoteBook {

    private ThreePlugIf plug;

    public NoteBook(ThreePlugIf plug) {
        this.plug = plug;
    }

    /**
     * 使用插座充电
     */
    public void charge() {
        plug.powerWithThree();
    }
}
