package com.mall.seckill.service;

import com.mall.seckill.domain.ClientDto;
import com.mall.seckill.dto.UmsClientType;

import java.util.List;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:38
 * description
 */
public interface UmsClientService {
    List<UmsClientType> getTypeList(Long clientId);

    /**
     * 获取用户信息
     */
    ClientDto loadClientByClientname(String clientname);
}
