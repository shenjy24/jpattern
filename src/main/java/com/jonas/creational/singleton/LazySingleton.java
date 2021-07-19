package com.jonas.creational.singleton;

/**
 * 懒汉式单例
 */
public class LazySingleton {
    //保证 instance 在所有线程中同步，volatile 保证可见性
    private static volatile LazySingleton instance = null;

    //private 避免类在外部被实例化
    private LazySingleton() {
    }

    //需要两点注意：一是需要进行同步操作；而是需要使用static，只能通过类方法进行调用
    public static synchronized LazySingleton getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
