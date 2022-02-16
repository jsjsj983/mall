package com.mall.seckill.mapper;

import com.mall.seckill.dto.UmsClientType;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:29
 * description
 */
@Mapper
public interface UmsClientTypeMapper {
    UmsClientType selectClientType(Long id);
}
