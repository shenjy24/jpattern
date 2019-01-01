package com.jonas.behavioral.iterator.aggregate;

import com.jonas.behavioral.iterator.iterator.AbstractIterator;

import java.util.List;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/01
 */
public abstract class AbstractObjectList {

    protected List<Object> objects;

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object object) {
        this.objects.add(object);
    }

    public void removeObject(Object object) {
        this.objects.remove(object);
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    /**
     * 声明创建迭代器对象的抽象工厂方法
     * @return
     */
    public abstract AbstractIterator createIterator();
}
