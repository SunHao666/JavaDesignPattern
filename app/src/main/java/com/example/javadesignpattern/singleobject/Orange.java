package com.example.javadesignpattern.singleobject;

/**
 * 静态内部类
 * 没有同步问题
 */
public class Orange {

    private Orange() {
    }

    public static class Build{
        public static Orange instance = new Orange();
    }
}
