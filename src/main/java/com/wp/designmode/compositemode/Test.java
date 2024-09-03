package com.wp.designmode.compositemode;

/**
 * @author wangpeng
 * @description Test
 * @date 2024/8/30 13:53
 **/
public class Test {
    public static void main(String[] args) {
        // 1.1、创建根节点
        CompositeGraphic root = new CompositeGraphic("我是root节点");
        // 1.2、创建根节点的2个子节点，一个是组合，一个是叶子节点
        CompositeGraphic rootComposite = new CompositeGraphic("我是root的一个composite容器");
        Graphic rootLeaf = new LineGraphic("我是root的叶子节点，我来画线");
        // 1.3、绑定根节点与其子节点
        root.add(rootLeaf);
        root.add(rootComposite);
        // 2.1、创建组合节点的子节点
        Graphic firstLeafOfRootComposite = new LineGraphic("我是composite容器的一个叶子节点，我来画线");
        Graphic secondLeafOfRootComposite = new RectangleGraphic("我是composite容器的一个叶子节点，我来画矩形");
        // 2.2、绑定组合节点和其子节点
        rootComposite.add(firstLeafOfRootComposite);
        rootComposite.add(secondLeafOfRootComposite);

        root.desc();
    }
}
