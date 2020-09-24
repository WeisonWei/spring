package com.weison.spring.ioc.lifecycle.single.config;

import com.weison.spring.ioc.lifecycle.single.bean.Pen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author weison
 * @date 2020 09 11
 * @see
 */
@Configuration
@ComponentScan("com.weison.spring.ioc.lifecycle.single.bean")
public class LifeCycleOrderConfig {

    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen pen() {
        return new Pen();
    }
}
