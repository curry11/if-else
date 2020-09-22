package com.example.demo.demo;

import com.example.demo.demo.abstracts.PayTaxesStrategy;
import com.example.demo.demo.factory.GetContryFactory;

/**
 * @program: demo
 * @description:
 * @author: 丁禾
 * @create: 2020-09-22 17:51
 **/
//测试类
public class Test1 {
    public static void main(String[] args) {
        String name = "China";
        GetContryFactory.register("China",new PayTaxesConcreteStrategyChina());
        GetContryFactory.register("Usa",new PayTaxesConcreteStrategyJapan());
        GetContryFactory.register("Japan",new PayTaxesConcreteStrategyUsa());
        PayTaxesStrategy payTaxesStrategy = GetContryFactory.getByRequestType(name);
        payTaxesStrategy.calculate(10000);
    }
}
