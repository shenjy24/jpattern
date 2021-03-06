package com.jonas.behavioral.strategy;

import lombok.Data;

/**
 * Context上下文，维护策略对象的引用
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
