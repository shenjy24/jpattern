package com.jonas.creational.abstractfactory.product;

import com.jonas.creational.abstractfactory.product.Button;

/**
 * 【 Spring按钮类：具体产品 】
 *
 * @author shenjy 2018/10/16
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
