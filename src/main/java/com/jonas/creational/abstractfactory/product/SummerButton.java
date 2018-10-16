package com.jonas.creational.abstractfactory.product;

/**
 * 【 Summer按钮类：具体产品 】
 *
 * @author shenjy 2018/10/16
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
