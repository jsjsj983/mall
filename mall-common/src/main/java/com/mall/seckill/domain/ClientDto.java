package com.mall.seckill.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:51
 * description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto implements Serializable {
    private Long id;
    private String clientId;
    private String clientSecret;
    private List<String> clientType;
}
