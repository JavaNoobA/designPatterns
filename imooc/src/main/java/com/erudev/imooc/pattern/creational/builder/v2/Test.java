package com.erudev.imooc.pattern.creational.builder.v2;

/**
 * Created by eru on 2020/1/28.
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseArticle("Java设计模式").buildCourseVideo("Java设计模式视频").build();
        System.out.println(course);
    }
}
