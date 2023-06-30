package com.example.orderservice.controller;

import com.example.orderservice.clients.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @GetMapping("/order")
    public String test(){
//        String url = "http://UserService/user";
//        String result = restTemplate.getForObject(url,String.class);

        String result = userClient.findUser("from order");
        return result;
    }
}
