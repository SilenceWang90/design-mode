package com.wp.designmode.adaptermode;

import com.wp.designmode.adaptermode.adapter.EightPlugAdapter;
import com.wp.designmode.adaptermode.adapter.FivePlugAdapter;
import com.wp.designmode.adaptermode.adapter.TwoPlugAdapter;
import com.wp.designmode.adaptermode.pluginterface.ThreePlugIf;
import com.wp.designmode.adaptermode.plugs.GBEightPlug;
import com.wp.designmode.adaptermode.plugs.GBFivePlug;
import com.wp.designmode.adaptermode.plugs.GBTwoPlug;
import com.wp.designmode.adaptermode.product.NoteBook;

/**
 * @Classname AdapterModeTest
 * @Description 适配器模式测试
 * @Date 2020/2/1 11:40
 * @Created by wangpeng116
 */
public class AdapterModeTest {
    /**
     * 笔记本需要三相插头，但是目前只有二相插头没有三相插头
     * 因此需要通过转换器将二相插头转成三相插头供笔记本使用
     * @param args
     */
    public static void main(String[] args) {
        /**1、创建插头实例**/
        //1.1、二相插头
        GBTwoPlug gbTwoPlug = new GBTwoPlug();
        //1.2、五相插头
        GBFivePlug gbFivePlug = new GBFivePlug();
        /**2、转换器(N相转三相)**/
        ThreePlugIf threePlugTwo = new TwoPlugAdapter(gbTwoPlug);
        ThreePlugIf threePlugFive = new FivePlugAdapter(gbFivePlug);
        /**3、创建需要插头的实例(笔记本)**/
        NoteBook noteBook1 = new NoteBook(threePlugTwo);
        NoteBook noteBook2 = new NoteBook(threePlugFive);
        noteBook1.charge();
        noteBook2.charge();


        /**优化测试**/
        ThreePlugIf threePlugIf = new EightPlugAdapter();
        NoteBook noteBook = new NoteBook(threePlugIf);
        noteBook.charge();
    }
}
