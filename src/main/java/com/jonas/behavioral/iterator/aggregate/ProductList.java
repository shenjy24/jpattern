package com.jonas.behavioral.iterator.aggregate;

import com.jonas.behavioral.iterator.iterator.AbstractIterator;
import com.jonas.behavioral.iterator.iterator.ProductIterator;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/01
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> products) {
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
