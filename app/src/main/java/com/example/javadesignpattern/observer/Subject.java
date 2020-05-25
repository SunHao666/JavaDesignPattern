package com.example.javadesignpattern.observer;

public interface Subject {

    void addObserver(Observer observer);

    void delObserver(Observer observer);

    void notifyObserver(String mes);
}
