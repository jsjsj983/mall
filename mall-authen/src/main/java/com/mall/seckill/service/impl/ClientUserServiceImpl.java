package com.mall.seckill.service.impl;

import com.mall.seckill.domain.ClientDto;
import com.mall.seckill.domain.SecurityClient;
import com.mall.seckill.service.UmsAdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 16:47
 * description
 */
@Slf4j
@Service
public class ClientUserServiceImpl implements ClientDetailsService {
    @Autowired
    private UmsAdminService umsClientService;

    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        System.out.println("s是"+s);
        ClientDto clientDto = umsClientService.loadClientByClientId(s);
        System.out.println("远程调用服务"+clientDto.getClientId());
        if(clientDto==null){
            log.error("未找到该客户端");
        }
        System.out.println("clientdto是"+clientDto);
        SecurityClient securityClient = new SecurityClient(clientDto);
        System.out.println("security是"+securityClient);
        return securityClient;
    }
}
