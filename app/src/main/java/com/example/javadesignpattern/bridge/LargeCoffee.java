package com.example.javadesignpattern.bridge;

public class LargeCoffee extends Coffee {

    public LargeCoffee(ICoffeeFlavor coffeeFlavor) {
        super(coffeeFlavor);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯："+this.coffeeFlavor.addFlavor());
    }
}
