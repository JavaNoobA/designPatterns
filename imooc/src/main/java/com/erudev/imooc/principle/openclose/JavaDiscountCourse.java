package com.erudev.imooc.principle.openclose;

/**
 * Created by eru on 2020/1/27.
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    public double getOriginPrice(){
        return super.getPrice();
    }

    public double getDiscountPrice(){
        return super.getPrice() * 0.8;
    }
}
