package com.example.javadesignpattern.samplefactory;

public class BYDCar implements Product {
    @Override
    public void drive() {
        System.out.println("今天开比亚迪");
    }
}
