package com.jonas.behavioral.template;

/**
 * Cricket
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class Cricket extends Game {
    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
