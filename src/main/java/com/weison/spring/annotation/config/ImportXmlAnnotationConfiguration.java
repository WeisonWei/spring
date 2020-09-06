package com.weison.spring.annotation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:bean-inject/spring.xml")
public class ImportXmlAnnotationConfiguration {

}
