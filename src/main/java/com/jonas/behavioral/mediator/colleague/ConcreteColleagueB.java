package com.jonas.behavioral.mediator.colleague;

/**
 * ConcreteColleagueB
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class ConcreteColleagueB extends Colleague {

    @Override
    public void receive(String message) {
        System.out.println("B receive message:" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("B send message:" + message);
        //请中介者转发
        mediator.reply(this, message);
    }
}
