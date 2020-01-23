package com.erudev.design.strategy.shopping;

/**
 * 现金收费工厂类
 * Created by eru on 2020/1/23.
 */
public class CashFactory {
    public static CashContext createCash(String condition){
        CashContext cc = null;
        switch (condition){
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "满300返100":
                cc = new CashContext(new CashReturn("300", "100"));
                break;
            case "打8折":
                cc = new CashContext(new CashRebate("0.8"));
                break;
        }
        return cc;
    }
}
