package com.jonas.behavioral.template;

/**
 * Football
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
