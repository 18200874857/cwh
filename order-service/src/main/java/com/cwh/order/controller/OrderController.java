package com.cwh.order.controller;

import com.cwh.order.client.UserServiceClient;
import com.cwh.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class OrderController {
    @Value("${foo}")
    String foo;
    @Value("${port}")
    String port;

    @Autowired
    OrderService orderService;


    @RequestMapping(value = "/getUserName2")
    public String getUserName2(String name) {
        return orderService.getUserName(name);
    }

    @RequestMapping(value = "/getUserName")
    public String getUserName(String name) {
        return "order："+name+",port："+port;
    }

    @RequestMapping(value = "/getOrderByName")
    public String getOrderByName(String name) {
        return orderService.getOrderByName(name);
    }

    @RequestMapping(path = "/getPropertiese")
    public String getPropertiese() {
        return "foo:"+foo+",port:"+port;
    }
}