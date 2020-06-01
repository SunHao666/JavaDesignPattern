package com.example.javadesignpattern;

import com.example.javadesignpattern.abstractfactory.DellFactory;
import com.example.javadesignpattern.abstractfactory.DellNoteComputer;
import com.example.javadesignpattern.build.CustomDialog;
import com.example.javadesignpattern.factory.ComputerFactory;
import com.example.javadesignpattern.factory.DellComputer;
import com.example.javadesignpattern.factory.ThinkPadComputer;
import com.example.javadesignpattern.observer.UserObserver;
import com.example.javadesignpattern.observer.WxSubject;
import com.example.javadesignpattern.prototype.BusinessCard;
import com.example.javadesignpattern.prototype.Info;
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

    @Test
    public void testAbstractFactory(){
        DellFactory dellFactory = new DellFactory();
        dellFactory.creatComputer(com.example.javadesignpattern.abstractfactory.DellComputer.class).startCreat();
        dellFactory.creatNote(DellNoteComputer.class).start();
    }
    //原型模式测试
    @Test
    public void testPrototype(){
        BusinessCard b1 = new BusinessCard();
        b1.setName("马云");
        b1.setCompany("alibaba");
        b1.setInfo(new Info("马","杭州"));
        b1.addList("http://pic1");

        BusinessCard b2 = b1.clone();
        b2.setName("马化腾");
        b2.setCompany("Tencent");
        b2.setInfo(new Info("er马","广州"));
        b2.addList("http://pic2");

        BusinessCard b3 = b1.clone();
        b3.setName("王建林");
        b3.setCompany("wanda");
        b3.setInfo(new Info("王","大连"));
        b3.addList("http://pic3");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }

}