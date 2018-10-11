package com.jonas.creational.simplefactory;

/**
 * 【 折线图 】
 *
 * @author shenjy 2018/10/11
 */
public class LineChart implements Chart {

    @Override
    public void display() {
        System.out.println("折线图");
    }

}
