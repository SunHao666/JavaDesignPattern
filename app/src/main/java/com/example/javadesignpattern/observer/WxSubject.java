package com.example.javadesignpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题-微信公众号
 */
public class WxSubject implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String mes) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(mes);
        }
    }
}
