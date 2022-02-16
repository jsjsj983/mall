package com.mall.seckill.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 陈述智  梦想开始远航的地方
 * @date 2021/12/15 17:19
 * description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UmsClientType implements Serializable {
    private Long id;
    private String type;
}
