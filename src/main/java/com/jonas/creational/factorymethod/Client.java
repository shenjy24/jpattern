package com.jonas.creational.factorymethod;

import com.jonas.creational.factorymethod.factory.FileLoggerFactory;
import com.jonas.creational.factorymethod.factory.LoggerFactory;
import com.jonas.creational.factorymethod.product.Logger;

/**
 * 【 客户端 】
 *
 * @author shenjy 2018/10/15
 */
public class Client {
    public static void main(String[] args) {

        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log();
    }
}
