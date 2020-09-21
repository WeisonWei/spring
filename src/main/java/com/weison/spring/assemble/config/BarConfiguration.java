package com.weison.spring.assemble.config;

import com.weison.spring.assemble.bean.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Weison
 * @date 2020/9/21
 */
@Configuration
public class BarConfiguration {

    @Bean
    public Bar littleBear() {
        return new Bar();
    }

}
