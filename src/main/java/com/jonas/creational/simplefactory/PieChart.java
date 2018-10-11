package com.jonas.creational.simplefactory;

/**
 * 【 饼状图 】
 *
 * @author shenjy 2018/10/11
 */
public class PieChart implements Chart {

    @Override
    public void display() {
        System.out.println("饼状图");
    }

}
