package com.jonas.creational.simplefactory;

/**
 * 【 客户端 】
 *
 * @author shenjy 2018/10/11
 */
public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
