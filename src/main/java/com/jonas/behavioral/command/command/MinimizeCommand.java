package com.jonas.behavioral.command.command;

import com.jonas.behavioral.command.receiver.WindowHandler;

/**
 * <p>
 * 最小化命令类：具体命令类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-27
 */
public class MinimizeCommand extends Command {

    private WindowHandler whObj; //维持对请求接收者的引用

    public MinimizeCommand() {
        whObj = new WindowHandler();
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        whObj.minimize();
    }
}
