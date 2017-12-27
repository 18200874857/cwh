package com.cwh.order.client;

import org.springframework.stereotype.Component;

/**
 * Created by cwh on 2017/12/27.
 */
@Component
public class UserServiceClientFallback implements UserServiceClient {
    @Override
    public String getUserName(String name) {
        System.out.println("aaa");
        return "sorry,"+name+",UserServiceClient发生异常，执行fallback方法";
    }
}
