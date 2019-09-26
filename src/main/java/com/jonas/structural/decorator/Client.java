package com.jonas.structural.decorator;

import com.jonas.structural.decorator.component.Component;
import com.jonas.structural.decorator.component.Window;
import com.jonas.structural.decorator.decorator.BlackBorderDecorator;
import com.jonas.structural.decorator.decorator.ScrollBarDecorator;

/**
 * <p>
 * 客户端测试代码
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-26
 */
public class Client {
    public static void main(String[] args) {
        Component component = new Window();
        Component scrollBarDecorator = new ScrollBarDecorator(component);
        Component blackBorderDecorator = new BlackBorderDecorator(scrollBarDecorator);
        blackBorderDecorator.display();
    }
}
