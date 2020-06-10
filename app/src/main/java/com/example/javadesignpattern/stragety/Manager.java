package com.example.javadesignpattern.stragety;

public class Manager {

    Fruit fruit;

    public Manager(Fruit fruit) {
        this.fruit = fruit;
    }

    public void eatFruit(){
        fruit.eatFruit();
    }
}
