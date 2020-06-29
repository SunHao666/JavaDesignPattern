package com.example.javadesignpattern;

import androidx.core.widget.TextViewCompat;

import com.example.javadesignpattern.abstractfactory.DellFactory;
import com.example.javadesignpattern.abstractfactory.DellNoteComputer;
import com.example.javadesignpattern.adapter.MAdapter;
import com.example.javadesignpattern.bridge.Coffee;
import com.example.javadesignpattern.bridge.ICoffeeFlavor;
import com.example.javadesignpattern.bridge.LargeCoffee;
import com.example.javadesignpattern.bridge.PlainCoffee;
import com.example.javadesignpattern.bridge.SmallCoffee;
import com.example.javadesignpattern.bridge.SugarCoffee;
import com.example.javadesignpattern.build.CustomDialog;
import com.example.javadesignpattern.cmd.CommondImpl;
import com.example.javadesignpattern.cmd.Invoke;
import com.example.javadesignpattern.cmd.test2.IWindCommond;
import com.example.javadesignpattern.cmd.test2.WinCommondMaxImpl;
import com.example.javadesignpattern.cmd.test2.WinCommondMinImpl;
import com.example.javadesignpattern.cmd.test2.WinInvoke;
import com.example.javadesignpattern.cmd.test2.WindReceive;
import com.example.javadesignpattern.decorator.HongQIGong;
import com.example.javadesignpattern.decorator.Swordsman;
import com.example.javadesignpattern.decorator.YangGuo;
import com.example.javadesignpattern.facade.Manager;
import com.example.javadesignpattern.factory.ComputerFactory;
import com.example.javadesignpattern.factory.DellComputer;
import com.example.javadesignpattern.factory.ThinkPadComputer;
import com.example.javadesignpattern.flyweight.IGoods;
import com.example.javadesignpattern.mediator.Champions;
import com.example.javadesignpattern.mediator.EMei;
import com.example.javadesignpattern.mediator.ShaoLin;
import com.example.javadesignpattern.mediator.WuDang;
import com.example.javadesignpattern.observer.UserObserver;
import com.example.javadesignpattern.observer.WxSubject;
import com.example.javadesignpattern.prototype.BusinessCard;
import com.example.javadesignpattern.prototype.Info;
import com.example.javadesignpattern.proxy.Car;
import com.example.javadesignpattern.proxy.Car1;
import com.example.javadesignpattern.proxy.Moveable;
import com.example.javadesignpattern.proxy.TimeInvocationHandler;
import com.example.javadesignpattern.responsebility.Handler;
import com.example.javadesignpattern.responsebility.HandlerA;
import com.example.javadesignpattern.responsebility.HandlerB;
import com.example.javadesignpattern.responsebility.HandlerC;
import com.example.javadesignpattern.responsebility.HandlerD;
import com.example.javadesignpattern.responsebility.HandlerReq;
import com.example.javadesignpattern.responsebility.RequestString;
import com.example.javadesignpattern.samplefactory.CarFactory;
import com.example.javadesignpattern.samplefactory.Product;
import com.example.javadesignpattern.singleobject.Apple;
import com.example.javadesignpattern.singleobject.Fruit;
import com.example.javadesignpattern.singleobject.Orange;
import com.example.javadesignpattern.state.Mp3Context;
import com.example.javadesignpattern.state.Mp3Controller;
import com.example.javadesignpattern.state.PowerOnState;

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


    @Test
    public void testdecorator(){
        Swordsman swordsman = new YangGuo();
        HongQIGong hongQIGong = new HongQIGong(swordsman);
        hongQIGong.attackMagic();
    }

    @Test
    public void testFacade(){
        Manager manager = new Manager();
        manager.skipMenu();
        manager.skipOrderList();
    }

    @Test
    public void testXY(){
        com.example.javadesignpattern.flyweight.ComputerFactory factory = new com.example.javadesignpattern.flyweight.ComputerFactory();
        IGoods goods = factory.creatGoods("Iphone7");
        goods.showGoodsPrice("32");

        IGoods goods1 = factory.creatGoods("Iphone7");
        goods1.showGoodsPrice("32");

        IGoods goods2 = factory.creatGoods("Iphone7");
        goods2.showGoodsPrice("256");
    }

    @Test
    public void textMedi(){
        Champions champions = new Champions();
        WuDang wuDang = new WuDang(champions);
        EMei eMei = new EMei(champions);
        ShaoLin shaoLin = new ShaoLin(champions);

        champions.seteMei(eMei);
        champions.setWuDang(wuDang);
        champions.setShaoLin(shaoLin);

//        wuDang.sendNotice();
        shaoLin.sendNotice();
    }

    @Test
    public void testMp3(){
        Mp3Controller controller = new Mp3Controller();
        controller.powerOn();
        controller.preSong();
        controller.powerOff();
        controller.powerOff();

    }

    @Test
    public void testState(){
        Mp3Context context = new Mp3Context();
        context.setMp3State(new PowerOnState());
        context.powerOn();
        context.powerOff();
        context.powerOn();
        context.preSong();
    }

    @Test
    public void testAdapter(){
        MAdapter adapter = new MAdapter();
        int result = adapter.to12();
        System.out.println(result);
    }

    @Test
    public void testBridge(){
        ICoffeeFlavor flavor = new PlainCoffee();
        Coffee coffee = new LargeCoffee(flavor);
        coffee.makeCoffee();

        ICoffeeFlavor flavor1 = new PlainCoffee();
        Coffee coffee1 = new SmallCoffee(flavor1);
        coffee1.makeCoffee();


        ICoffeeFlavor flavor2 = new SugarCoffee();
        Coffee coffee2 = new LargeCoffee(flavor2);
        coffee2.makeCoffee();
    }

    @Test
    public void testLink(){
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();

        handlerA.setNextHandler(handlerB);

        handlerA.handRequest("reqA");
    }

    @Test
    public void testLink1(){
        HandlerReq h1 = new HandlerC(new RequestString("request1"));
        HandlerReq h2 = new HandlerD(new RequestString("request2"));

        h1.setNextHandler(h2);
        h1.handrequest(new RequestString("request2"));
    }
    @Test
    public void testCmd(){
        CommondImpl commond = new CommondImpl();
        Invoke invoke = new Invoke(commond);
        invoke.action();
    }

    @Test
    public void testWindCmd(){
        WindReceive receive = new WindReceive();
        IWindCommond commond = new WinCommondMaxImpl(receive);
        WinInvoke invoke = new WinInvoke(commond);
        invoke.action();


        IWindCommond minommond = new WinCommondMinImpl(receive);
        WinInvoke minInvoke = new WinInvoke(minommond);
        minInvoke.action();

    }
}