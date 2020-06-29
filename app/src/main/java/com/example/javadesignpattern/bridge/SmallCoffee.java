package com.example.javadesignpattern.bridge;

public class SmallCoffee extends Coffee {

    public SmallCoffee(ICoffeeFlavor coffeeFlavor) {
        super(coffeeFlavor);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯："+this.coffeeFlavor.addFlavor());
    }
}
