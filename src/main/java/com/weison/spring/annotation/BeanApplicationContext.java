package com.weison.spring.annotation;

import com.weison.spring.annotation.config.BeanConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@Slf4j
public class BeanApplicationContext {

    public static void main(String[] args) {

        //1 获取@Bean注解 配合 @Configuration使用
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Arrays.stream(beanDefinitionNames).forEach(name -> log.info("-1->" + name));

        log.info("---BeanApplicationContext---");
    }

}
