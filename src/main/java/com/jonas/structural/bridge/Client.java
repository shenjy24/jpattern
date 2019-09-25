package com.jonas.structural.bridge;

import com.jonas.structural.bridge.abstraction.Image;
import com.jonas.structural.bridge.abstraction.PNGImage;
import com.jonas.structural.bridge.implementor.WindowsImp;

/**
 * <p>
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-25
 */
public class Client {
    public static void main(String[] args) {
        Image image = new PNGImage();
        image.setImp(new WindowsImp());  //依赖注入
        image.parseFile("test.png");
    }
}
