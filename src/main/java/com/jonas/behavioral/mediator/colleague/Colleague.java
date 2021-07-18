package com.jonas.behavioral.mediator.colleague;

import com.jonas.behavioral.mediator.mediator.Mediator;

/**
 * Colleague 抽象同事类
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public abstract class Colleague {

    //中介者抽象类
    protected Mediator mediator;

    //接收消息
    public abstract void receive(String message);

    //发送消息
    public abstract void send(String message);

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
