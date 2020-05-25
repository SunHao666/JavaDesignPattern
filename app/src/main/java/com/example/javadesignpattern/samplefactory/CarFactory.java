package com.example.javadesignpattern.samplefactory;

/**
 * 工厂类 根据传入的参数创建不同的产品
 */
public class CarFactory {
    private Product product;
    public Product creatCar(String carType){
        if(carType.equals("byd")){
            product = new BYDCar();
        }else if(carType.equals("crv")){
            product = new CRVCar();
        }
        return product;
    }
}
