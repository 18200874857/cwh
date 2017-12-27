package com.cwh.user.controller;

import com.cwh.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "/getUserName")
    public String getUserName(String name) {
        return userService.getUserName(name);
    }
}