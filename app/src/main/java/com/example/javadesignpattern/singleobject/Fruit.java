package com.example.javadesignpattern.singleobject;

public class Fruit {
    //饿汉式
    private static Fruit instance = new Fruit();

    private Fruit() {
    }

    public static Fruit getInstance() {
        return instance;
    }

    public void wash(){
        System.out.println("洗水果");
    }
}
