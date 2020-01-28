package com.erudev.imooc.pattern.creational.abstractfactory;

/**
 * Created by eru on 2020/1/28.
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory javaFactory = new JavaCourseFactory();
        Article article = javaFactory.getArticle();
        Video video = javaFactory.getVideo();
        article.produce();
        video.produce();
    }
}
