package com.example.javadesignpattern.bridge;

public class SugarCoffee implements ICoffeeFlavor {
    @Override
    public String addFlavor() {
        return "加糖";
    }
}
