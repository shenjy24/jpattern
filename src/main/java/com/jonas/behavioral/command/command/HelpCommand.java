package com.jonas.behavioral.command.command;

import com.jonas.behavioral.command.receiver.HelpHandler;

/**
 * <p>
 * 帮助命令类：具体命令类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-27
 */
public class HelpCommand extends Command {
    private HelpHandler hhObj; //维持对请求接收者的引用

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        hhObj.display();
    }
}
