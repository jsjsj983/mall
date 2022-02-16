package com.mall.seckill.config;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
import com.alibaba.fastjson.JSON;
import com.mall.seckill.api.CommonResult;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * <p>Title: SentinelGateWayConfig</p>
 * Description：
 * date：2020/7/10 17:57
 */
@Configuration
public class SentinelGateWayConfig {

	public SentinelGateWayConfig(){
		GatewayCallbackManager.setBlockHandler((exchange, t) ->{
			// 网关限流了请求 就会回调这个方法
			CommonResult<Object> error = CommonResult.failed("请求的人太多");
			String errJson = JSON.toJSONString(error);
			Mono<ServerResponse> body = ServerResponse.ok().body(Mono.just(errJson), String.class);
			return body;
		});
	}
}
