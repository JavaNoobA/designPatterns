package com.erudev.design.simpleFactory.second;

/**
 * Created by eru on 2020/1/23.
 */
public class OperationSub extends Operation{

    @Override
    public double getResult() {
        return numA - numB;
    }
}
