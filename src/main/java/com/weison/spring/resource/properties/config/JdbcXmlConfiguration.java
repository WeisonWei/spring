package com.weison.spring.resource.properties.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Configuration
@ComponentScan("com.weison.spring.resource.properties.bean")
@PropertySource("classpath:jdbc/jdbc.xml")
public class JdbcXmlConfiguration {

}
