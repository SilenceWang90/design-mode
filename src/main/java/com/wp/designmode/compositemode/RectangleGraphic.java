package com.wp.designmode.compositemode;

import lombok.Data;

/**
 * @author wangpeng
 * @description Rectangle
 * @date 2024/8/30 13:55
 **/
@Data
public class RectangleGraphic extends Graphic {

    public RectangleGraphic(String name) {
        this.name = name;
    }

    @Override
    public void desc() {
        System.out.println(name);
    }
}
