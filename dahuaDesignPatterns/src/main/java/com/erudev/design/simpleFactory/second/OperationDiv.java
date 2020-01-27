package com.erudev.design.simpleFactory.second;

/**
 * Created by eru on 2020/1/23.
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (numB == 0){
            throw new RuntimeException("除数不能为0");
        }
        return numA / numB;
    }
}
