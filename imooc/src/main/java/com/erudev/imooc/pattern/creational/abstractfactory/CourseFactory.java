package com.erudev.imooc.pattern.creational.abstractfactory;

/**
 * Created by eru on 2020/1/28.
 */
public abstract class CourseFactory {
    abstract Video getVideo();
    abstract Article getArticle();
}
