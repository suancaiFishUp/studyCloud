package com.example.userservice.controller;
import com.example.userservice.config.PatternPropertise;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
//@RefreshScope
@Slf4j
public class UserController {

    @Autowired
    Environment environment;

    @Autowired
    private PatternPropertise patternPropertise;

//    @Value("${pattern.dateformat}")
//    private String dateformat;

    public String getPort(){
        return environment.getProperty("local.server.port");
    }

    public String getCluster() { return environment.getProperty("spring.cloud.nacos.discovery.cluster-name"); }

    @GetMapping("pro")
    public String propertise(){
        return patternPropertise.toString();
    }

    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternPropertise.getDateformat()));
    }

    @RequestMapping("/user")
    public String user(@RequestParam String text){

        return "this is user" + " : " + getPort() + "---" + text;
    }
}
