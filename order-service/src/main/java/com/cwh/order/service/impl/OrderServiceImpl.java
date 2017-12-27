package com.cwh.order.service.impl;

import com.cwh.order.client.UserServiceClient;
import com.cwh.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    UserServiceClient userServiceClient;

    @Override
    public String getOrderByName(String name) {
        return "order："+name;
    }

    @Override
    public String getUserName(String name) {
        return userServiceClient.getUserName(name);
    }


}
