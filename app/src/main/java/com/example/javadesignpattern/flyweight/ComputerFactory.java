package com.example.javadesignpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    private Map<String,IGoods> pool = new HashMap<>();

    public IGoods creatGoods(String name){
        if(pool.containsKey(name)){
            System.out.println("使用缓存");
            return pool.get(name);
        }else{
            IGoods goods = new ComputerGoods(name);
            pool.put(name,goods);
            return goods;
        }

    }

}
