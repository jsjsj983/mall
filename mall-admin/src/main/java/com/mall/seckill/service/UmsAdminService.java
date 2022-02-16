package com.mall.seckill.service;

import com.mall.seckill.api.CommonResult;
import com.mall.seckill.domain.UserDto;
import com.mall.seckill.dto.UmsAdmin;
import com.mall.seckill.dto.UmsAdminParam;
import com.mall.seckill.dto.UmsRole;
import com.mall.seckill.dto.UpdateAdminPasswordParam;

import java.util.List;

/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {
    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 获取用户对于角色
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 调用认证中心返回结果
     */
    CommonResult login(String username, String password);

    /**
     * 获取用户信息
     */
    UserDto loadUserByUsername(String username);

    /**
     * 根据用户名获取后台管理员 从缓存当中获取
     * @param username 用户名
     * @return 返回用户实体类
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 获取当前登录的后台用户
     */
    UmsAdmin getCurrentAdmin();

    /**
     * 根据用户名或昵称分页查询用户
     */
    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 根据用户id获取用户
     */
    UmsAdmin getItem(Long id);

    /**
     * 修改密码
     */
    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    /**
     * 修改指定用户信息
     */
    int update(Long id, UmsAdmin admin);

    /**
     * 删除指定用户
     */
    int delete(Long id);
}
