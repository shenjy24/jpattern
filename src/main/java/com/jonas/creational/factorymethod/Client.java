package com.jonas.creational.factorymethod;

import com.jonas.creational.factorymethod.factory.AbstractLoggerFactory;
import com.jonas.creational.factorymethod.factory.DatabaseLoggerFactory;
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

        //1
        LoggerFactory factory1 = new FileLoggerFactory();
        Logger logger1 = factory1.createLogger();
        logger1.log();

//        AbstractLoggerFactory factory2 = new DatabaseLoggerFactory();
//        factory2.log();
    }
}
