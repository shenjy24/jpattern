package com.jonas.creational.abstractfactory.product;

/**
 * 【 Summer文本框类：具体产品 】
 *
 * @author shenjy 2018/10/16
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}
