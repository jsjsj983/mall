package com.mall.seckill.mapper;

import com.mall.seckill.dto.UmsAdmin;
import com.mall.seckill.dto.UmsAdminExample;
import com.mall.seckill.dto.UmsClient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/13 23:14
 * description
 */
@Mapper
public interface UmsAdminMapper {
    List<UmsAdmin> selectByExample(UmsAdminExample example);

    int insert(UmsAdmin record);

    UmsClient selectClientByAdminId(Long adminId);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);

    int deleteByPrimaryKey(Long id);
}
