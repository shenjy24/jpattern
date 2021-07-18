package com.jonas.behavioral.mediator.mediator;

import com.jonas.behavioral.mediator.colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator 具体中介者类
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleague.setMediator(this);
            colleagues.add(colleague);
        }
    }

    @Override
    public void reply(Colleague colleague, String message) {
        colleagues.forEach(c -> {
            if (!c.equals(colleague)) {
                c.receive(message);
            }
        });
    }
}
