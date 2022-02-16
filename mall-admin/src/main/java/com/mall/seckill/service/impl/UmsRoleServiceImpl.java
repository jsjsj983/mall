package com.mall.seckill.service.impl;

import com.mall.seckill.dto.UmsMenu;
import com.mall.seckill.mapper.UmsRoleDao;
import com.mall.seckill.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/16 13:55
 * description
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleDao roleDao;

    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }
}
