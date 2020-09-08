package com.weison.spring.annotation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@Slf4j
public class ComponentScanApplicationContext {

    public static void main(String[] args) {
        //1 获取@Component @Controller @Service 等bean注解 配合 @ComponentScan使用
        //此处已经配置扫描包全限定名 不需要使用@ComponentScan 也能加载
        ApplicationContext context = new AnnotationConfigApplicationContext("com.weison.spring.annotation.beans");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Arrays.stream(beanDefinitionNames).forEach(name -> log.info("-1->" + name));

        log.info("---ComponentScanApplicationContext---");
    }

}
