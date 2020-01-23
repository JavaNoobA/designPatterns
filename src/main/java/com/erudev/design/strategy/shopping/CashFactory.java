package com.erudev.design.strategy.shopping;

/**
 * 现金收费工厂类
 * Created by eru on 2020/1/23.
 */
public class CashFactory {
    public static CashSuper createCash(String condition){
        CashSuper cs = null;
        switch (condition){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn("300", "100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
                break;
        }
        return cs;
    }
}
