package com.jonas.creational.abstractfactory.factory;

import com.jonas.creational.abstractfactory.product.*;

/**
 * 【 Spring皮肤工厂：具体工厂 】
 *
 * @author shenjy 2018/10/16
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
