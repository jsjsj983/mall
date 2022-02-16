package com.mall.seckill.controller;

import com.mall.seckill.api.CommonResult;
import com.mall.seckill.service.impl.ClientUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 19:37
 * description
 */
@RestController
public class test {
    @Autowired
    private ClientUserServiceImpl clientUserService;
    @RequestMapping("/client")
    public CommonResult<ClientDetails> clientCommonResult(String name){
        ClientDetails clientDetails = clientUserService.loadClientByClientId(name);
        return CommonResult.success(clientDetails);
    }
}
