package com.jonas.creational.builder.concrete_builder;

import com.jonas.creational.builder.abstract_builder.ActorBuilder;

/**
 * Concrete Builder
 *
 * @author shenjy 2018/12/24
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    @Override
    public boolean isBareheaded() {
        return true;
    }
}
