package com.erudev.design.strategy.shopping;

/**
 * 正常收费子类
 * Created by eru on 2020/1/23.
 */
public class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
