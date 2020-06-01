package com.example.javadesignpattern.prototype;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型类
 */
public class BusinessCard implements Cloneable {
    public String name;
    public String company;
    public Info info = new Info("","");
    public ArrayList<String> pics = new ArrayList<>();

    public BusinessCard(){
        System.out.println("BusinessCard 构造函数");
    }

    public void addList(String pic){
        pics.add(pic);
    }

    public void setInfo(Info info) {
        this.info.name = info.name;
        this.info.address = info.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @NonNull
    @Override
    public BusinessCard clone(){
        BusinessCard businessCard = null;
        try {
            businessCard = (BusinessCard) BusinessCard.super.clone();
            businessCard.pics = (ArrayList<String>) this.pics.clone();
            businessCard.info = this.info.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return businessCard;
    }

    @Override
    public String toString() {
        return "BusinessCard{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", info=" + info.toString() +
                ",list.size=="+pics.size()+'}';
    }
}
