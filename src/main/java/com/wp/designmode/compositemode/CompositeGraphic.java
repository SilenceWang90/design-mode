package com.wp.designmode.compositemode;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangpeng
 * @description 组件
 * @date 2024/8/30 13:52
 **/
@Data
public class CompositeGraphic extends Graphic {

    public CompositeGraphic(String name) {
        this.name = name;
    }

    // 用于存储子图形
    private List<Graphic> childGraphics = new ArrayList<>();

    // 添加子图形
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    // 移除子图形
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }

    // 绘制所有子图形
    @Override
    public void desc() {
        System.out.println(name);
        for (Graphic graphic : childGraphics) {
            graphic.desc();
        }
    }
}
