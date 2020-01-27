package com.erudev.imooc.principle.depenceinversion;

/**
 * Created by eru on 2020/1/27.
 */
public class Erudev {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
