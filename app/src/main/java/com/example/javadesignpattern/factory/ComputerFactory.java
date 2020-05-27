package com.example.javadesignpattern.factory;

/**
 * 创建对象业务类
 * 相比简单工厂模式 新增产品类不需要修改此类
 * 满足开放封闭原则
 */
public class ComputerFactory {

    public static <T extends Computer> T newInstance(Class<T> clz){
        T t = null;
        try {
            t = clz.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return t;
    }
}
