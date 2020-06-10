package com.example.javadesignpattern.mediator;

/**
 * 抽象同事类
 * 持有中介者
 * 从外边传入方便是同一个中介者或者用单例模式
 */
public abstract class United {
    public WuLinAlliance wuLinAlliance;

    public United(WuLinAlliance wuLinAlliance) {
        this.wuLinAlliance = wuLinAlliance;
    }
}
