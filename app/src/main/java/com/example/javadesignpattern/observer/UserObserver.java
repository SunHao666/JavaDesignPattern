package com.example.javadesignpattern.observer;

/**
 * 微信用户
 */
public class UserObserver implements Observer{
    @Override
    public void update(String mes) {
        System.out.println("微信公众号更新信息 "+mes);
    }
}
