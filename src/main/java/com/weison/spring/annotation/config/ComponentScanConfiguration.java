package com.weison.spring.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//一个配置类就可以类似的理解为一个xml
@Configuration
@ComponentScan(basePackages = "com.weison.spring.annotation.bean")
public class ComponentScanConfiguration {
}
