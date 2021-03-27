package com.wez.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * LogFilter
 *
 * @Author wez
 * @Time 2021/3/27 16:42
 */
@Component
@Slf4j
public class LogFilter implements GlobalFilter, Ordered {

    /**
     * 过滤器方法
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("请求开始。。。");

        // 过滤业务逻辑，校验是否有username

        // 获取请求参数
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username == null) {
            log.error("非法访问，用户名为null");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }

        log.info(username + "正在访问~~~");

        log.info(username + "请求结束！！！");
        return chain.filter(exchange); // 放行
    }

    /**
     * 设置Filter的顺序，数字越小顺序越靠前
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
