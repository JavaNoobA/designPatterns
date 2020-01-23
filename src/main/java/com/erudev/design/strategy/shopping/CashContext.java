package com.erudev.design.strategy.shopping;

/**
 * Created by eru on 2020/1/23.
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cashSuper){
        this.cs = cashSuper;
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
