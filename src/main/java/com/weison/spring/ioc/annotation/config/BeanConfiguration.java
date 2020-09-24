package com.weison.spring.ioc.annotation.config;

import com.weison.spring.ioc.annotation.bean.Bear;
import com.weison.spring.ioc.annotation.bean.Rabbit;
import com.weison.spring.ioc.annotation.bean.Tiger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weison
 * @description 一个配置类就可以类似的理解为一个xml
 * @description @Bean 需要与 @Configuration 配合使用
 * @date 2020 09 06
 * @see
 */
@Configuration
public class BeanConfiguration {

    @Bean
    public Bear bear() {
        return new Bear("bear");
    }

    @Bean
    public Rabbit rabbit() {
        return new Rabbit("rabbit");
    }

    @Bean
    public Tiger tiger() {
        return new Tiger("tiger");
    }

}
