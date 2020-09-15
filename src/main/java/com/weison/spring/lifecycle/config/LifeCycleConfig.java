package com.weison.spring.lifecycle.config;

import com.weison.spring.lifecycle.bean.BlackGirl;
import com.weison.spring.lifecycle.bean.Girl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 11
 * @see
 */
@Configuration
@ComponentScan("com.weison.spring.lifecycle.bean")
public class LifeCycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Girl littleGirl() {
        return new Girl().setName("Alice");
    }

    @Bean(initMethod = "grow", destroyMethod = "getBaby")
    public BlackGirl littleBlackGirl() {
        return new BlackGirl().setName("Elene");
    }
}
