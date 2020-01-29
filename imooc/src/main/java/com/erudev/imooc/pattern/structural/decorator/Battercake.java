package com.erudev.imooc.pattern.structural.decorator;

/**
 * Created by eru on 2020/1/29.
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
