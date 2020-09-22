package com.example.demo.demo;


import com.example.demo.demo.abstracts.PayTaxesStrategy;
import com.example.demo.demo.factory.GetContryFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: 丁禾
 * @create: 2020-09-22 18:04
 **/
@Service
public class PayTaxesConcreteStrategyChina implements PayTaxesStrategy, InitializingBean {

    @Override
    public double calculate( int money) {
        return money * 0.2;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        GetContryFactory.register("China",new PayTaxesConcreteStrategyChina());
    }
}
