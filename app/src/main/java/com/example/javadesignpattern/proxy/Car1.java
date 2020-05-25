package com.example.javadesignpattern.proxy;

public class Car1 implements Moveable {
    private Moveable moveable;

    public Car1(Moveable moveable){
        this.moveable = moveable;
    }

    @Override
    public void drive() {
        System.out.println("汽车开始行驶》》》》");
        //调用目标类的方法
        moveable.drive();
        System.out.println("汽车行驶结束》》》》");
    }
}
