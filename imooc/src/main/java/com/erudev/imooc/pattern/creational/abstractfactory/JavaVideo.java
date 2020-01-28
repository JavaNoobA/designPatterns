package com.erudev.imooc.pattern.creational.abstractfactory;

/**
 * Created by eru on 2020/1/28.
 */
public class JavaVideo extends Video {
    @Override
    void produce() {
        System.out.println("录制Java视频");
    }
}
