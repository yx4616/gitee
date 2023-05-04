package com.rjxy.controller;

import com.rjxy.pojo.Order;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/order/{id}")
    public  String findOrderById(@PathVariable String id){
        Order order=new Order();
        order.setId("123");
        order.setPrice(123.4);
        order.setReceiverName("小强");
        order.setReceiverAddress("北京");
        order.setReceiverPhone("15877778888");
        return order.toString()+",端口号："+port;
    }

}
