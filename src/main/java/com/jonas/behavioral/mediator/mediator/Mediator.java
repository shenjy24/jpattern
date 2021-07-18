package com.jonas.behavioral.mediator.mediator;

import com.jonas.behavioral.mediator.colleague.Colleague;

/**
 * Mediator 抽象中介者
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public abstract class Mediator {

    //注册同事
    public abstract void register(Colleague colleague);

    //通知中介者，发送消息
    public abstract void reply(Colleague colleague, String message);
}
