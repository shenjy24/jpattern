package com.jonas.creational.abstractfactory.product;

/**
 * 【 Spring文本框类：具体产品 】
 *
 * @author shenjy 2018/10/16
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }
}
