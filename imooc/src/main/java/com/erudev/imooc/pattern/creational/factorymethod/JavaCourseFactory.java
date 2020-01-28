package com.erudev.imooc.pattern.creational.factorymethod;

/**
 * Created by eru on 2020/1/28.
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    Course study() {
        return new JavaCourse();
    }
}
