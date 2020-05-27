package com.example.javadesignpattern;

import com.example.javadesignpattern.build.CustomDialog;
import com.example.javadesignpattern.factory.ComputerFactory;
import com.example.javadesignpattern.factory.DellComputer;
import com.example.javadesignpattern.factory.ThinkPadComputer;
import com.example.javadesignpattern.observer.UserObserver;
import com.example.javadesignpattern.observer.WxSubject;
import com.example.javadesignpattern.proxy.Car;
import com.example.javadesignpattern.proxy.Car1;
import com.example.javadesignpattern.proxy.Moveable;
import com.example.javadesignpattern.proxy.TimeInvocationHandler;
import com.example.javadesignpattern.samplefactory.CarFactory;
import com.example.javadesignpattern.samplefactory.Product;
import com.example.javadesignpattern.singleobject.Apple;
import com.example.javadesignpattern.singleobject.Fruit;
import com.example.javadesignpattern.singleobject.Orange;

import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testObserver(){
        WxSubject wxSubject = new WxSubject();
        wxSubject.addObserver(new UserObserver());
        wxSubject.notifyObserver("两会开始了");
    }

    @Test
    public void testSampleFactory(){
        CarFactory factory = new CarFactory();
        Product crv = factory.creatCar("crv");
        crv.drive();
    }

    @Test
    public void testBuild(){
        CustomDialog customDialog = new CustomDialog.Build()
                .setTitle("警告")
                .setContent("确定删除")
                .creat();
    }

    @Test
    public void testSingle(){
        Apple apple = Apple.getInstance();
        Apple apple1 = Apple.getInstance();
        if(apple == apple1){
            System.out.println("单例");
        }

        Fruit fruit = Fruit.getInstance();

        Orange orange = Orange.Build.instance;
        Orange orange1 = Orange.Build.instance;
        if(orange == orange1){
            System.out.println("单例静态");
        }
    }

    @Test
    public void testProxy(){
        Car car = new Car();
        Car1 car1 = new Car1(car);
        //调用被代理类方法 间接调用目标类
        car1.drive();
    }

    @Test
    public void testProxy1(){
        Car car = new Car();
        TimeInvocationHandler handler = new TimeInvocationHandler(car);
        Moveable o = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(),
                car.getClass().getInterfaces(), handler);
        o.drive();
    }

    @Test
    public void testFactory(){
        ComputerFactory factory = new ComputerFactory();
        ThinkPadComputer thinkPadComputer = factory.newInstance(ThinkPadComputer.class);
        thinkPadComputer.startCreat();

        DellComputer dellComputer = factory.newInstance(DellComputer.class);
        dellComputer.startCreat();
    }
}