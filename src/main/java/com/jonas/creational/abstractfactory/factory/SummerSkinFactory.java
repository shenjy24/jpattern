package com.jonas.creational.abstractfactory.factory;

import com.jonas.creational.abstractfactory.product.*;

/**
 * 【 Summer皮肤工厂：具体工厂 】
 *
 * @author shenjy 2018/10/16
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
