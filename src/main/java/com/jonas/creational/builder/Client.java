package com.jonas.creational.builder;

import com.jonas.creational.builder.abstract_builder.ActorBuilder;
import com.jonas.creational.builder.concrete_builder.AngelBuilder;
import com.jonas.creational.builder.director.ActorController;
import com.jonas.creational.builder.product.Actor;

/**
 * 客户端
 *
 * @author shenjy 2018/12/24
 */
public class Client {

    public static void main(String[] args) {
        ActorBuilder actorBuilder = new AngelBuilder();

        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(actorBuilder);

        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
