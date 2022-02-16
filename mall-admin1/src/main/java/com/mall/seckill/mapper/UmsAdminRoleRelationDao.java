package com.mall.seckill.mapper;

import com.mall.seckill.dto.UmsRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/13 23:16
 * description
 */
@Mapper
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);
}
