package com.jonas.behavioral.command;

import com.jonas.behavioral.command.command.HelpCommand;
import com.jonas.behavioral.command.command.MinimizeCommand;
import com.jonas.behavioral.command.invoker.FunctionButton;

/**
 * <p>
 * 客户端测试代码
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-27
 */
public class Client {
    public static void main(String[] args) {
        FunctionButton helpButton = new FunctionButton("Help功能键");
        helpButton.setCommand(new HelpCommand());
        helpButton.onClick();

        FunctionButton windowButton = new FunctionButton("窗口缩小功能键");
        windowButton.setCommand(new MinimizeCommand());
        windowButton.onClick();
    }
}
