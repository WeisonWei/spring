package com.weison.spring.lifecycle.config;

import com.weison.spring.lifecycle.bean.Girl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 11
 * @see
 */
@Configuration
public class LifeCycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Girl littleGirl() {
        return new Girl();
    }
}
