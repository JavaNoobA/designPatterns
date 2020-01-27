package com.erudev.design.shopping;

/**
 * 打折收费子类
 * Created by eru on 2020/1/23.
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(String rebate){
        this.moneyRebate = Double.parseDouble(rebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * this.moneyRebate;
    }
}
