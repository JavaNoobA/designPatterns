package com.erudev.imooc.pattern.creational.singleton;

/**
 * Created by eru on 2020/1/28.
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){
        if (InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
