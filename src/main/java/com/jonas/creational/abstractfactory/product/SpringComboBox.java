package com.jonas.creational.abstractfactory.product;

/**
 * 【 Spring组合框类：具体产品 】
 *
 * @author shenjy 2018/10/16
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框");
    }
}
