package com.erudev.imooc.openclose;

/**
 * Created by eru on 2020/1/27.
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaDiscountCourse(1, "Java设计模式", 349d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)javaCourse;
        System.out.println("course name:" + javaDiscountCourse.getName() + " origin price: " + javaDiscountCourse.getOriginPrice() +
                " discount price: " + javaDiscountCourse.getDiscountPrice());


    }
}
