package com.wp.designmode.compositemode;

/**
 * @author wangpeng
 * @description 组件接口
 * @date 2024/8/30 13:51
 **/
public abstract class Graphic {
    protected String name;

    // 所有的组件都有的功能
    protected abstract void desc();
}
