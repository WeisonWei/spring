package com.weison.spring.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author weison
 * @description 扫描bean并读取properties的属性配置
 * @description 读取properties文件，加载到 SpringFramework的IOC容器后，会转换成Map的形式来保存在 @see Environment
 * @date 2020 09 06
 * @see
 */
@Configuration
@ComponentScan("com.weison.spring.annotation.bean")
@PropertySource("classpath:bean-inject/bean.properties")
public class InjectValueConfiguration {
}
