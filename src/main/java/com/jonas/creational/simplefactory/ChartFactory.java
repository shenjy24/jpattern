package com.jonas.creational.simplefactory;

/**
 * 【 静态工厂 】
 *
 * @author shenjy 2018/10/11
 */
public class ChartFactory {

    /**
     * 静态工厂方法
     * @param type
     * @return
     */
    public static Chart getChart(String type) {

        switch (type) {
            case "histogram":
                return new HistogramChart();
            case "pie":
                return new PieChart();
            case "line":
                return new PieChart();
            default:
                return null;
        }

    }
}
