package com.jonas.creational.builder.director;

import com.jonas.creational.builder.abstract_builder.ActorBuilder;
import com.jonas.creational.builder.product.Actor;

/**
 * 指挥者
 *
 * @author shenjy 2018/12/24
 */
public class ActorController {
    /**
     * 逐步构建复杂产品对象
     * @param ab
     * @return
     */
    public Actor construct(ActorBuilder ab) {
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        Actor actor = ab.createActor();
        return actor;
    }
}
