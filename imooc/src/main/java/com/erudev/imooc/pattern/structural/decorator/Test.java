package com.erudev.imooc.pattern.structural.decorator;

/**
 * Created by eru on 2020/1/29.
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + " 销售价格: " + aBattercake.cost());
    }
}
