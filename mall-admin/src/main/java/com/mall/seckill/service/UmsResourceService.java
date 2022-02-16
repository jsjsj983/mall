package com.mall.seckill.service;

import java.util.List;
import java.util.Map;

/**
 * 后台资源管理Service
 * Created by macro on 2020/2/2.
 */
public interface UmsResourceService {
    /**
     * 初始化资源角色规则
     */
    Map<String, List<String>> initResourceRolesMap();
}
