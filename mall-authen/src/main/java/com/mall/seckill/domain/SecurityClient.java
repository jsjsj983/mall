package com.mall.seckill.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 16:50
 * description 客户端实体类 第三方客户端信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityClient implements ClientDetails {
    /**
     * 客户端id
     */
    private Long id;
    /**
     * 客户端名字
     */
    private String clientId;
    /**
     * 客户端密钥  采用BCrypt算法
     */
    private String clientSecret;
    /**
     * 客户端授权类型 这里是多采用的事密码模式
     */
    private List<String> clientType;
    /**
     * 权限数据 可自定义权限
     */
    private Collection<GrantedAuthority> authorities;

    public SecurityClient(ClientDto clientDto){
        BeanUtils.copyProperties(clientDto,this);
        if (clientDto.getClientType() != null) {
            authorities = new ArrayList<>();
            clientDto.getClientType() .forEach(item -> authorities.add(new SimpleGrantedAuthority(item)));
        }
    }

    /**
     *
     * @return 返回客户端名字
     */
    @Override
    public String getClientId() {
        return this.clientId;
    }

    /**
     *
     * @return 返回客户端的跳转路径 这里设置为null
     */
    @Override
    public Set<String> getResourceIds() {
        return null;
    }

    /**
     *
     * @return 保密要求
     */
    @Override
    public boolean isSecretRequired() {
        return true;
    }

    /**
     * @return    得到加密秘钥
     */
    @Override
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     *
     * @return 是否有范围
     */
    @Override
    public boolean isScoped() {
        return true;
    }

    /**
     * 设置范围
     * @return 返回设置的范围
     */
    @Override
    public Set<String> getScope() {
        HashSet<String> strings = new HashSet<>();
        strings.add("all");
        return strings;
    }

    /**
     *
     * @return 返回授权类型
     */
    @Override
    public Set<String> getAuthorizedGrantTypes() {
        Set<String> collect = this.clientType.stream().collect(Collectors.toSet());
        return collect;
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        return null;
    }

    /**
     *
     * @return 返回权限列表
     */
    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    /**
     *
     * @return 设置token过期时间
     */
    @Override
    public Integer getAccessTokenValiditySeconds() {
        return 3600*24;
    }

    /**
     *
     * @return 设置刷新token的过期时间
     */
    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return 3600*24*7;
    }

    @Override
    public boolean isAutoApprove(String s) {
        return true;
    }

    /**
     *
     * @return 补充资料
     */
    @Override
    public Map<String, Object> getAdditionalInformation() {
        return null;
    }
}
