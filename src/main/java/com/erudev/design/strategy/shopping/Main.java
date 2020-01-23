package com.erudev.design.strategy.shopping;

/**
 * 客户端程序
 * Created by eru on 2020/1/23.
 */
public class Main {
    public static void main(String[] args) {
        CashContext cc = CashFactory.createCash("打8折");
        double result = cc.getResult(300);
        System.out.println("result = " + result);
    }
}
