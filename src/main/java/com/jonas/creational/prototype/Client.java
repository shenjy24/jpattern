package com.jonas.creational.prototype;

public class Client {

    public static void main(String[] args) {
        Person person = new Person("Tom", "程序员", new Computer("黑色","联想"));
        System.out.println("原型类:" + person);
        System.out.println("通过重写clone方式实现深拷贝:");
        Person clonePerson1 = (Person) person.clone();
        System.out.println("clonePerson1:" + (clonePerson1.getComputer() == person.getComputer()));

        System.out.println("通过序列化对象实现深拷贝:");
        Person clonePerson2 = person.deepClone();
        System.out.println("clonePerson2:" + (clonePerson2.getComputer() == person.getComputer()));
    }
}
