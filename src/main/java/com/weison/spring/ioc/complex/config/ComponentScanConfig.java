package com.weison.spring.ioc.complex.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 06
 * @see
 */
@Configuration
@ComponentScan(value = "com.weison.spring.ioc.complex.beans.bean")
public class ComponentScanConfig {
}
