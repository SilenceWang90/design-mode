package com.wp.designmode.compositemode;

import lombok.Data;

/**
 * @author wangpeng
 * @description LeafGraphic
 * @date 2024/8/30 13:54
 **/
@Data
public class LineGraphic extends Graphic{

    public LineGraphic(String name){
        this.name = name;
    }

    @Override
    public void desc() {
        System.out.println(name);
    }
}
