package com.weison.spring.annotation.config;

import com.weison.spring.annotation.bean.Bear;
import com.weison.spring.annotation.bean.Rabbit;
import com.weison.spring.annotation.bean.Tiger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//一个配置类就可以类似的理解为一个xml
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
