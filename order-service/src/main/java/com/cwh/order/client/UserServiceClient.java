package com.cwh.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service",fallback = UserServiceClientFallback.class)
public interface UserServiceClient {
    @RequestMapping(value = "/getUserName",method = RequestMethod.POST)
    String getUserName(@RequestParam(value = "name") String name);
}
