package com.erudev.imooc.principle.openclose;

/**
 * Created by eru on 2020/1/27.
 */
public class JavaCourse implements ICourse {

    private Integer id;

    private String name;

    private double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
