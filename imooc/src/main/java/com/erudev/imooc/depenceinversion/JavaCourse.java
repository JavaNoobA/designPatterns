package com.erudev.imooc.depenceinversion;

/**
 * Created by eru on 2020/1/27.
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("learning Java Course");
    }
}
