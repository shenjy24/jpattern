package com.jonas.behavioral.template;

/**
 * Game
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-07-18
 */
public abstract class Game {

    //模板方法，使用final方法禁止子类重写
    public final void play(){
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

    protected void initialize() {
        System.out.println("Init in Game");
    }

    protected void startPlay() {
        System.out.println("Start in Game");
    }

    protected void endPlay() {
        System.out.println("End in Game");
    }
}
