package com.jonas.creational.factorymethod;

/**
 * 【 具体产品 】
 *
 * @author shenjy 2018/10/15
 */
public class DatabaseLogger implements Logger {

    @Override
    public void log() {
        System.out.println("数据库日志记录");
    }

}
