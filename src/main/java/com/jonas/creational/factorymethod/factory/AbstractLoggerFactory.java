package com.jonas.creational.factorymethod.factory;

import com.jonas.creational.factorymethod.product.Logger;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2018/12/16
 */
public abstract class AbstractLoggerFactory {

    public void log() {
        Logger logger = createLogger();
        logger.log();
    }

    /**
     * 创建product抽象方法
     * @return
     */
    public abstract Logger createLogger();
}
