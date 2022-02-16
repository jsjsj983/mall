package com.mall.seckill.service;


import com.mall.seckill.domain.ClientDto;
import com.mall.seckill.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by macro on 2019/10/18.
 */
@FeignClient("mall-admin")
public interface UmsAdminService {

    @GetMapping("/admin/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);

    @RequestMapping("/client/loadClientByClientId")
    ClientDto loadClientByClientId(@RequestParam String clientname);
}
