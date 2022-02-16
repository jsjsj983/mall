package com.mall.seckill.mapper;

import com.mall.seckill.dto.UmsClientType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:31
 * description
 */
@Mapper
public interface UmsClientRelationMapper {
    List<UmsClientType> getTypeList(Long clientId);
}
