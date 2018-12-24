package com.jonas.creational.builder;

/**
 * Abstract Builder
 *
 * @author shenjy 2018/12/24
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    /**
     * 工厂方法，返回一个完整的游戏角色对象
     */
    public Actor createActor() {
        return actor;
    }

    /**
     * 钩子方法
     * @return
     */
    public boolean isBareheaded() {
        return false;
    }
}
