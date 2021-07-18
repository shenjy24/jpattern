package com.jonas.behavioral.mediator.colleague;

/**
 * ConcreteColleagueA
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class ConcreteColleagueA extends Colleague {

    @Override
    public void receive(String message) {
        System.out.println("A receive message:" + message);
    }

    @Override
    public void send(String message) {
        System.out.println("A send message:" + message);
        //请中介者转发
        mediator.reply(this, message);
    }
}
