package com.erudev.imooc.pattern.creational.singleton;

/**
 * Created by eru on 2020/1/28.
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
