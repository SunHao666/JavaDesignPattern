package com.example.javadesignpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * 日志代理
 */
public class TimeInvocationHandler implements InvocationHandler {

    //目标类对象
    private Car car;

    public TimeInvocationHandler(Car car) {
        this.car = car;
    }

    @Override
    public Object invoke(Object o, final Method method, Object[] objects) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("汽车开始行驶》》》》"+start);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new Random().nextInt()+2000);
                    //反射调用目标类方法
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        method.invoke(car);
        System.out.println("汽车行驶结束》》》》"+(System.currentTimeMillis()-start));
        return null;
    }
}
