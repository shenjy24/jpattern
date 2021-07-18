package com.jonas.behavioral.strategy;

/**
 * Client
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.contextInterface();

        context.setStrategy(new ConcreteStrategyB());
        context.contextInterface();
    }
}
