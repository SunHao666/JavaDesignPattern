package com.example.javadesignpattern.proxy;

/**
 * 目标类或被代理类
 */
public class Car implements Moveable{
    @Override
    public void drive() {
        System.out.println("正在开车");
    }
}
