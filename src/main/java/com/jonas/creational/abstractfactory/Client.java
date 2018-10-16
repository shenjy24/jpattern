package com.jonas.creational.abstractfactory;

import com.jonas.creational.abstractfactory.factory.SkinFactory;
import com.jonas.creational.abstractfactory.factory.SpringSkinFactory;
import com.jonas.creational.abstractfactory.product.Button;
import com.jonas.creational.abstractfactory.product.ComboBox;
import com.jonas.creational.abstractfactory.product.TextField;

/**
 * 【 客户端 】
 *
 * @author shenjy 2018/10/16
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = new SpringSkinFactory();
        Button button = skinFactory.createButton();
        button.display();
        TextField textField = skinFactory.createTextField();
        textField.display();
        ComboBox comboBox = skinFactory.createComboBox();
        comboBox.display();
    }
}
