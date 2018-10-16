package com.jonas.creational.abstractfactory.product;

/**
 * 【 Summer组合框类：具体产品 】
 *
 * @author shenjy 2018/10/16
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框");
    }
}
