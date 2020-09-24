package com.weison.spring.ioc.annotation;

import com.weison.spring.ioc.annotation.bean.Fish;
import com.weison.spring.ioc.annotation.bean.Pig;
import com.weison.spring.ioc.annotation.bean.PigPapa;
import com.weison.spring.ioc.annotation.config.InjectValueConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author weison
 * @description 实例化bean并从properties中读取属性值
 * @date 2020 09 06
 * @see
 */
@Slf4j
public class InjectValueApplicationContext {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Arrays.stream(beanDefinitionNames).forEach(name -> log.info("-1->" + name));

        Fish fish = context.getBean(Fish.class);
        Pig pig = context.getBean(Pig.class);
        PigPapa pigPapa = context.getBean(PigPapa.class);
        log.info("---InjectValueApplicationContext---");
    }
}
