package com.mall.seckill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallGatewayApplication {
    public static void main(String[] args) {
        System.setProperty("csp.sentinel.app.type","1");
        SpringApplication.run(MallGatewayApplication.class, args);
    }

}
