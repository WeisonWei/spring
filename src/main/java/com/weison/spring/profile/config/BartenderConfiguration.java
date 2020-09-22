package com.weison.spring.profile.config;

import com.weison.spring.profile.bean.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Weison
 * @date 2020/9/21
 */
@Configuration
@Profile("city") //编程式设置 配置式：VM options:-Dspring.profile.active=city
public class BartenderConfiguration {
    @Bean
    public Bartender zhangSan() {
        return new Bartender("张三");
    }

    @Bean
    public Bartender liSi() {
        return new Bartender("李四");
    }
}
