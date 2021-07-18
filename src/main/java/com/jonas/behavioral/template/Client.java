package com.jonas.behavioral.template;

/**
 * Client
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public class Client {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
