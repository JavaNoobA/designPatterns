package com.erudev.design.simpleFactory.second;

/**
 * Created by eru on 2020/1/23.
 */
public class Main {
    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperator("*");
        oper.numA = 10;
        oper.numB = 20;
        double result = oper.getResult();
        System.out.println(result);
    }
}
