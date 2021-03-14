package com.wez.loadbalancer.rule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RandomRuleConfig
 *
 * @Author wez
 * @Time 2021/3/14 10:14
 */
@Configuration
public class RandomRuleConfig {

    @Bean
    public RandomRule randomRule() {
        return new RandomRule();
    }

}
