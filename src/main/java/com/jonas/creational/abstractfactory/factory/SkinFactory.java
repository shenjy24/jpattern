package com.jonas.creational.abstractfactory.factory;

import com.jonas.creational.abstractfactory.product.Button;
import com.jonas.creational.abstractfactory.product.ComboBox;
import com.jonas.creational.abstractfactory.product.TextField;

/**
 * 【 界面皮肤工厂接口：抽象工厂 】
 *
 * @author shenjy 2018/10/16
 */
public interface SkinFactory {
    /**
     * 创建按钮工厂方法
     * @return
     */
    Button createButton();

    /**
     * 创建文本框工厂方法
     * @return
     */
    TextField createTextField();

    /**
     * 创建组合框工厂方法
     * @return
     */
    ComboBox createComboBox();
}
