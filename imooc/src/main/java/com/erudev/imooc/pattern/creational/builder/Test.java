package com.erudev.imooc.pattern.creational.builder;

/**
 * Created by eru on 2020/1/28.
 */
public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseBuilder courseBuilder = new CourseActualBuilder();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式", "Java设计模式PPT",
                "Java设计模式手记", "Java设计模式视频", "Java设计模式QA");
        System.out.println(course);
    }
}
