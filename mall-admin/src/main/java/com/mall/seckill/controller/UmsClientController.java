package com.mall.seckill.controller;

import com.mall.seckill.domain.ClientDto;
import com.mall.seckill.service.impl.UmsClientServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:56
 * description 客户端管理
 */
@Api(tags = "UmsClientController",value = "客户端管理")
@Controller
@RequestMapping("/client")
public class UmsClientController {
    @Autowired
    private UmsClientServiceImpl umsClientService;

    @ApiOperation(value = "查询客户端信息")
    @ResponseBody
    @RequestMapping(value = "/loadClientByClientId", method = RequestMethod.GET)
    public ClientDto loadClientByClientId(@RequestParam String clientname){
        System.out.println("接收到要查询的客户端"+clientname);
        return  umsClientService.loadClientByClientname(clientname);
    }
}
