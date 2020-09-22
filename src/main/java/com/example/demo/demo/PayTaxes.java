package com.example.demo.demo;

/**
 * @program: demo
 * @description:
 * @author: 丁禾
 * @create: 2020-09-22 17:51
 **/
public class PayTaxes {

    private String name;
    private double money;

    public PayTaxes(String name,double money){
        this.money = money;
        this.name = name;
    }

    public double calculate(){
        if(name.equals("China")){
            return money * 0.2;
        }else if(name.equals("USA")){
            return money * 0.3;
        }else {
            return money * 0.33;
        }
    }
}

