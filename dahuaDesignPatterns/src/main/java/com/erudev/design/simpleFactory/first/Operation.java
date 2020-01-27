package com.erudev.design.simpleFactory.first;

/**
 * Created by eru on 2020/1/23.
 */
public class Operation {
    public static double getResult(double numA, double numB, String operator){
        double result = 0d;
        switch (operator){
            case "+":
                result = numA + numB;
                break;
            case "-":
                result = numA - numB;
                break;
            case "*":
                result = numA * numB;
                break;
            case "/":
                result = numA / numB;
                break;
        }
        return result;
    }
}
