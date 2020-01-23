package com.erudev.design.strategy.shopping;

/**
 * 返利收费子类
 * Created by eru on 2020/1/23.
 */
public class CashReturn extends CashSuper {

    private double moneyCondition;

    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn){
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }


    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money > moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
