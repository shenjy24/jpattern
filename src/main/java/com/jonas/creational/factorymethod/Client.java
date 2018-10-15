package com.jonas.creational.factorymethod;

/**
 * 【 客户端 】
 *
 * @author shenjy 2018/10/15
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.log();
    }
}
