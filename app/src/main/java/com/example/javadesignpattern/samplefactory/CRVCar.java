package com.example.javadesignpattern.samplefactory;

public class CRVCar implements Product {
    @Override
    public void drive() {
        System.out.println("今天开CRV");
    }
}
