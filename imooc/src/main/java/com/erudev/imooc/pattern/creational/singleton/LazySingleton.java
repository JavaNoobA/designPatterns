package com.erudev.imooc.pattern.creational.singleton;

/**
 * Created by eru on 2020/1/28.
 */
public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton(){}

    public synchronized static LazySingleton getInstance(){
        if (singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
