package com.example.demo.demo.factory;

import com.example.demo.demo.abstracts.PayTaxesStrategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: demo
 * @description:
 * @author: 丁禾
 * @create: 2020-09-22 18:20
 **/
public class GetContryFactory {

    private static Map<String, PayTaxesStrategy> request = new ConcurrentHashMap<String, PayTaxesStrategy>();

    public  static PayTaxesStrategy getByRequestType(String name){
        return request.get(name);
    }

    public static void register(String name,PayTaxesStrategy spRequest){
        request.put(name,spRequest);
    }
}
