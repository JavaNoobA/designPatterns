package com.erudev.imooc.pattern.creational.simplefactory;

/**
 * Created by eru on 2020/1/27.
 */
public class CourseFactory {

    //public Course produce(String type){
    //    if ("java".equals(type)){
    //        return new JavaCourse();
    //    }else if ("python".equals(type)){
    //        return new PythonCourse();
    //    }
    //    return null;
    //}

    public Course produce(Class c){
        Course course = null;
        try {
            course = (Course) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return course;
    }
}
