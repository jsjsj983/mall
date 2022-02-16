package com.mall.seckill.controller;

import com.mall.seckill.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: macro陈
 * @Created date：2022/1/21.
 */
@Controller
public class testController {

    @Autowired
    private AuthService authService;
    @Value("${server.port}")
    private String getport;

    @GetMapping("/port")
    public  String  getport(){
        return authService.getPort();
    }

    @ResponseBody
    @GetMapping("/getport")
    public  String  port(){
        return this.getport;
    }

}
