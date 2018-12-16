package com.jonas.creational.factorymethod.factory;

import com.jonas.creational.factorymethod.product.Logger;

/**
 * 【 抽象工厂 】
 *
 * @author shenjy 2018/10/15
 */
public interface LoggerFactory {
    Logger createLogger();
}
