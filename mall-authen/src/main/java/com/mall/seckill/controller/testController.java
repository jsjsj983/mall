package com.mall.seckill.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class testController {
    @Value("${server.port}")
    private String port ;
    
    @ResponseBody
    @GetMapping("/port")
    public String getPort(){
        return  "hello i am"+port;
    }
}