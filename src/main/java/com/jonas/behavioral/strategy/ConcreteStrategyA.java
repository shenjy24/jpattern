package com.jonas.behavioral.strategy;

/**
 * ConcreteStrategyA
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class ConcreteStrategyA extends Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}
