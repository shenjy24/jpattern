package com.jonas.behavioral.iterator;

import com.jonas.behavioral.iterator.aggregate.AbstractObjectList;
import com.jonas.behavioral.iterator.aggregate.ProductList;
import com.jonas.behavioral.iterator.iterator.AbstractIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 *
 * @author shenjy 2019/01/01
 */
public class Client {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        //创建聚合对象
        AbstractObjectList list = new ProductList(products);

        //创建迭代器对象
        AbstractIterator iterator = list.createIterator();

        System.out.println("正向遍历");
        while (!iterator.isLast()) {
            System.out.print(iterator.getNextItem() + ",");
            iterator.next();
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("逆向遍历：");
        while (!iterator.isFirst()) {
            System.out.print(iterator.getPreviousItem() + "，");
            iterator.previous();
        }
    }
}
