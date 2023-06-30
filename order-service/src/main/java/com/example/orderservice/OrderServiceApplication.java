package com.example.orderservice;

import com.example.orderservice.config.DefaultFeignConfiguration;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Slf4j
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = DefaultFeignConfiguration.class)
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

//	@Bean
//	@LoadBalanced
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}

//	@Bean
//	public IRule randomRule(){
//		return new RandomRule();
//	}
}
