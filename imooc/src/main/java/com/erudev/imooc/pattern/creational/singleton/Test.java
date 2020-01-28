package com.erudev.imooc.pattern.creational.singleton;

import java.io.*;

/**
 * Created by eru on 2020/1/28.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Thread t1 = new Thread(new T());
        //Thread t2 = new Thread(new T());
        //t1.start();
        //t2.start();
        //System.out.println("program end");

        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
