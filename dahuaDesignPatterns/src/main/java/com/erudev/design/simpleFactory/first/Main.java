package com.erudev.design.simpleFactory.first;

import java.util.Scanner;

/**
 * Created by eru on 2020/1/23.
 */
public class Main {
    public static void main(String[] args) {
        double numA = 0d;
        double numB = 0d;
        String operator = null;

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            numA = Double.parseDouble(scanner.next());
            numB = Double.parseDouble(scanner.next());
            operator = scanner.next();
            if ("quit".equals(scanner.next())){
                break;
            }
        }
        System.out.println("计算结果为 = " + com.erudev.design.simpleFactory.Operation.getResult(numA, numB, operator));
    }
}
