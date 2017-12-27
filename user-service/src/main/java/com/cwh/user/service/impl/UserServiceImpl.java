package com.cwh.user.service.impl;

import com.cwh.user.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Value("${server.port}")
    String port;

    @Override
    public String getUserName(String name) {
        return "user："+name+",port："+port;
    }
}
