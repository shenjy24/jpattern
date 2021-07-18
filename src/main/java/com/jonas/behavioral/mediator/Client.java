package com.jonas.behavioral.mediator;

import com.jonas.behavioral.mediator.colleague.Colleague;
import com.jonas.behavioral.mediator.colleague.ConcreteColleagueA;
import com.jonas.behavioral.mediator.colleague.ConcreteColleagueB;
import com.jonas.behavioral.mediator.mediator.ConcreteMediator;
import com.jonas.behavioral.mediator.mediator.Mediator;

/**
 * Client
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class Client {
    public static void main(String[] args) {

        //构建中介者
        Mediator mediator = new ConcreteMediator();

        //构建具体的同事类
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        //注册同事
        mediator.register(colleagueA);
        mediator.register(colleagueB);

        //发送消息
        colleagueA.send("Hello! I am A.");
        colleagueB.send("Hello! I am B.");
    }

}
