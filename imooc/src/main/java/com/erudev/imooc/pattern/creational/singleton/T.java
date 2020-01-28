package com.erudev.imooc.pattern.creational.singleton;

/**
 * Created by eru on 2020/1/28.
 */
public class T implements Runnable {
    @Override
    public void run() {
        //LazySingleton instance = LazySingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
