package com.example.orderservice.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("UserService")
public interface UserClient {

    @GetMapping("/user")
    String findUser(@RequestParam("text") String text);
}
