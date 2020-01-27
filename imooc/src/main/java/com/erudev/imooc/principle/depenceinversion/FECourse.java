package com.erudev.imooc.principle.depenceinversion;

/**
 * Created by eru on 2020/1/27.
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("learning FE Course");
    }
}
