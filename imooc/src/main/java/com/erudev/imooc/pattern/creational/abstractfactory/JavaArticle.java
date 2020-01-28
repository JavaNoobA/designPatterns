package com.erudev.imooc.pattern.creational.abstractfactory;

/**
 * Created by eru on 2020/1/28.
 */
public class JavaArticle extends Article {
    @Override
    void produce() {
        System.out.println("编写Java");
    }
}
