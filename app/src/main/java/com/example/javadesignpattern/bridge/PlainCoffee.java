package com.example.javadesignpattern.bridge;

public class PlainCoffee implements ICoffeeFlavor {
    @Override
    public String addFlavor() {
        return "原味";
    }

    public String test(){
        return "123";
    }
}
