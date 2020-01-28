package com.erudev.imooc.pattern.creational.factorymethod;

/**
 * Created by eru on 2020/1/27.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory javaCourseFactory = new JavaCourseFactory();
        CourseFactory pythonCourseFactory = new PythonCourseFactory();
        javaCourseFactory.study();
    }
}
