package com.weison.spring.ioc.aware.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Weison
 * @date 2020/9/8
 */
@Configuration
@ComponentScan(value = "com.weison.spring.ioc.aware.beans.bean")
public class AwareConfiguration {

    @Bean
    public BeanAware beanAware123456() {
        return new BeanAware();
    }
}
