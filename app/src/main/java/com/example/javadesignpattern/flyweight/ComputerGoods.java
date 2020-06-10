package com.example.javadesignpattern.flyweight;

/**
 * 具体享元类
 */
public class ComputerGoods implements IGoods {
    //内部状态 可共享 不可变
    private String name;
    //外部状态 可变，不共享
    private String version;

    public ComputerGoods(String name){
        this.name = name;
    }

    @Override
    public void showGoodsPrice(String version) {
        if(version.equals("32")){
            System.out.println("商品的价格是5000元");
        }else if (version.equals("256")){
            System.out.println("商品的价格是15000元");
        }
    }
}
