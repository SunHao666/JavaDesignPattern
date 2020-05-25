package com.example.javadesignpattern.singleobject;

/**
 * 懒汉
 * 有同步问题
 */
public class Apple {

    private static Apple instance;

    private Apple() {
    }

    public static Apple getInstance() {
        if(instance == null){
            instance = new Apple();
        }
        return instance;
    }

    public static Apple newInstance(){
        if(instance == null){
            synchronized (Apple.class){
                if(instance == null){
                    instance = new Apple();
                }
            }
        }
        return instance;
    }
}
