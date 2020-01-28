package com.erudev.imooc.pattern.creational.abstractfactory;

/**
 * Created by eru on 2020/1/28.
 */
public class JavaCourseFactory extends CourseFactory {
    @Override
    Video getVideo() {
        return new JavaVideo();
    }

    @Override
    Article getArticle() {
        return new JavaArticle();
    }
}
