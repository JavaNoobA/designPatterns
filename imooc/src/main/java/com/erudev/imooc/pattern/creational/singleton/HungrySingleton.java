package com.erudev.imooc.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Created by eru on 2020/1/28.
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    public Object readResolve(){
        return hungrySingleton;
    }
}
