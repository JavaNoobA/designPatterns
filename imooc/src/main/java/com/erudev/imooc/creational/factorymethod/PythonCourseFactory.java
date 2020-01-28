package com.erudev.imooc.creational.factorymethod;

/**
 * Created by eru on 2020/1/28.
 */
public class PythonCourseFactory extends CourseFactory {
    @Override
    Course study() {
        return new PythonCourse();
    }
}
