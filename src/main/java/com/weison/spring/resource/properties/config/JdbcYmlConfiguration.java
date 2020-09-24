package com.weison.spring.resource.properties.config;

import com.weison.spring.resource.properties.support.YmlPropertySourceFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Configuration
@ComponentScan("com.weison.spring.resource.properties.bean")
//@PropertySource("classpath:jdbc/jdbc.yml") yml解析需引入jar包支持
@PropertySource(value = "classpath:jdbc/jdbc.yml", factory = YmlPropertySourceFactory.class)
public class JdbcYmlConfiguration {

}
