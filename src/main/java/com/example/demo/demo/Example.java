package com.example.demo.demo;

import com.example.demo.demo.abstracts.PayTaxesStrategy;
import com.example.demo.demo.factory.GetContryFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: demo
 * @description:
 * @author: 丁禾
 * @create: 2020-09-22 18:53
 **/
@Controller
class Example {
    @RequestMapping("/")
    @ResponseBody
    public double hello() {
        String name = "China";
        PayTaxesStrategy payTaxesStrategy = GetContryFactory.getByRequestType(name);
        return payTaxesStrategy.calculate(10000);
    }
}
