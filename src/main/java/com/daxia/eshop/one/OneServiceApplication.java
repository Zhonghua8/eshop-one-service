package com.daxia.eshop.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/4 11:07
 * @Version 1.0
 */

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class OneServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneServiceApplication.class, args);
    }
}
