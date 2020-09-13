package com.weison.spring.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author weison
 * @description 一个配置类就可以类似的理解为一个xml
 * @description @ComponentScan 扫描 @Component及其拓展注解 并实例化bean
 * @date 2020 09 06
 * @see
 */
@Configuration
@ComponentScan(basePackages = "com.weison.spring.annotation.bean")
public class ComponentScanConfiguration {
}
