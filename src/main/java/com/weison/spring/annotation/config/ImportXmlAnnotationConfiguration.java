package com.weison.spring.annotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author weison
 * @description 一个配置类就可以类似的理解为一个xml
 * @description @Configuration 导入xml上下文配置 并读取properties中属性配置保存在Environment中
 * @date 2020 09 06
 * @see org.springframework.core.env.Environment
 * @see org.springframework.core.env.AbstractEnvironment
 */
@Configuration
@ImportResource("classpath:bean-inject/spring.xml")
@PropertySource("classpath:bean-inject/bean.properties")
public class ImportXmlAnnotationConfiguration {

}
