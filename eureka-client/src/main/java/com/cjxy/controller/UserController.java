package com.cjxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class UserController {
        @Autowired
        private RestTemplate restTemplate;
        @RequestMapping("/findOrdersByUser/{id}")
        public String findOrdersByUser(@PathVariable String id) {
            // 假设用户只有一个订单，并且订单id为123
            int oid = 123;
            //RestTemplate类用于调用Restful服务，可以通过getForObject()方法实现接口调用
            return this.restTemplate.getForObject("http://eureka-client-order/order/" + oid, String.class);
        }
    }
