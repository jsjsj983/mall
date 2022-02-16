package com.mall.seckill.mapper;

import com.mall.seckill.dto.UmsClient;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:23
 * description
 */
@Mapper
public interface UmsClientMapper {
    UmsClient selectClientById(String clientName);
}
