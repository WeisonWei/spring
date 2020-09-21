package com.weison.spring.assemble.config;

import com.weison.spring.assemble.bean.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weixiaoxing
 * @date 2020/9/21
 */
@Configuration
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
