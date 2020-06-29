package com.example.javadesignpattern.bridge;

public abstract class Coffee {

    ICoffeeFlavor coffeeFlavor;

    public Coffee(ICoffeeFlavor coffeeFlavor){
        this.coffeeFlavor = coffeeFlavor;
    }

    public abstract void makeCoffee();

}
