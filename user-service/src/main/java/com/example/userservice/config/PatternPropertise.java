package com.example.userservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "pattern")
@Component
public class PatternPropertise {
    private String dateformat;
    private String envShare;
}
