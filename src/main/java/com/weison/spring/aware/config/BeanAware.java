package com.weison.spring.aware.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Weison
 * @date 2020/9/8
 */
@Slf4j
public class BeanAware implements ApplicationContextAware, BeanNameAware {

    private String beanName;
    private ApplicationContext applicationContext;

    public void printBeanNames() {
        log.info("==printBeanNames=begin=");
        Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        log.info("==printBeanNames=end=");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        log.info("==BeanAware==");
        Arrays.stream(beanDefinitionNames)
                .forEach(name -> log.info("-name->" + name));
    }

    @Override
    public void setBeanName(String beanName) {
        log.info("-beanName->" + beanName);
        this.beanName = beanName;
    }

}
