package com.erudev.imooc.pattern.creational.simplefactory;

/**
 * Created by eru on 2020/1/27.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        Course course = courseFactory.produce(JavaCourse.class);
        System.out.println(course);
    }
}
