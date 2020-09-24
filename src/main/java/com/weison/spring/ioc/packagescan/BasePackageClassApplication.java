package com.weison.spring.ioc.packagescan;

import com.weison.spring.ioc.packagescan.config.TypeFilterConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Slf4j
public class BasePackageClassApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TypeFilterConfiguration.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        Stream.of(beanDefinitionNames).forEach(log::info);
    }
}
