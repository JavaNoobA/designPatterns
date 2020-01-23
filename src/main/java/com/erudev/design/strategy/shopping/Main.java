package com.erudev.design.strategy.shopping;

/**
 * 客户端程序
 * Created by eru on 2020/1/23.
 */
public class Main {
    public static void main(String[] args) {
        CashSuper cs = CashFactory.createCash("打8折");
        double result = cs.acceptCash(300);
        System.out.println("result = " + result);
    }
}
