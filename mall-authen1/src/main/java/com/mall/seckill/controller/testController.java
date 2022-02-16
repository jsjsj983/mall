package com.mall.seckill.controller;

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
    @Value("${server.port}")
    private String port ;

    @ResponseBody
    @GetMapping("/port")
    public String getPort(){
        return  "hello i am"+port;
    }
}
