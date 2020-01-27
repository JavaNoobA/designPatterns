package com.erudev.imooc.depenceinversion;

/**
 * Created by eru on 2020/1/27.
 */
public class Test {
    public static void main(String[] args) {
        // v1
        //Erudev erudev = new Erudev();
        //erudev.studyJavaCourse();
        //erudev.studyFECourse();

        // v2
        //Erudev erudev = new Erudev();
        //erudev.studyImoocCourse(new JavaCourse());
        //erudev.studyImoocCourse(new FECourse());

        // v3
        //Erudev erudev = new Erudev(new JavaCourse());
        //erudev.studyImoocCourse();

        // v4
        Erudev erudev = new Erudev();
        erudev.setiCourse(new JavaCourse());
        erudev.studyImoocCourse();
        erudev.setiCourse(new FECourse());
        erudev.studyImoocCourse();
    }
}
