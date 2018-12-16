package com.jonas.creational.factorymethod.factory;

import com.jonas.creational.factorymethod.product.FileLogger;
import com.jonas.creational.factorymethod.product.Logger;

/**
 * 【 具体工厂 】
 *
 * @author shenjy 2018/10/15
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
