package com.mall.seckill.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.mall.seckill.domain.ClientDto;
import com.mall.seckill.dto.UmsClient;
import com.mall.seckill.dto.UmsClientType;
import com.mall.seckill.mapper.UmsAdminMapper;
import com.mall.seckill.mapper.UmsClientMapper;
import com.mall.seckill.mapper.UmsClientRelationMapper;
import com.mall.seckill.mapper.UmsClientTypeMapper;
import com.mall.seckill.service.UmsClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:40
 * description
 */
@Service
public class UmsClientServiceImpl implements UmsClientService {
    @Autowired
    private UmsClientMapper umsClientMapper;
    @Autowired
    private UmsClientTypeMapper umsClientTypeMapper;
    @Autowired
    private UmsClientRelationMapper umsClientRelationMapper;
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    @Override
    public List<UmsClientType> getTypeList(Long clientId) {
        return umsClientRelationMapper.getTypeList(clientId);
    }

    @Override
    public ClientDto loadClientByClientname(String clientname) {
        UmsClient umsClient = umsClientMapper.selectClientById(clientname);
        System.out.println("找到的umsclient"+umsClient);
        if (umsClient!=null){
            List<UmsClientType> typeList = getTypeList(umsClient.getId());
            ClientDto clientDto = new ClientDto();
            BeanUtils.copyProperties(umsClient,clientDto);
            System.out.println("umsClient的id"+umsClient.getClientId());
            System.out.println("clientdto的id"+clientDto.getId());
            if(CollUtil.isNotEmpty(typeList)){
                List<String> TypeList = typeList.stream().map(UmsClientType::getType).collect(Collectors.toList());
                clientDto.setClientType(TypeList);
            }
            System.out.println("clientdto是"+clientDto);
            return clientDto;
        }
        return null;
    }

}
