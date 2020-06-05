package com.example.javadesignpattern.facade;

/**
 * 外观类
 * 对外提供一个高级接口，供调用
 * 隐藏子系统的处理逻辑
 */
public class Manager {

    private final MakeMenu makeMenu;
    private final OrderList orderList;

    public Manager() {
        makeMenu = new MakeMenu();
        orderList = new OrderList();
    }

    public void skipMenu(){
        makeMenu.creat();
    }

    public void skipOrderList(){
        orderList.open();
    }
}
