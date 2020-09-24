package com.weison.spring.resource.properties;

import com.weison.spring.resource.properties.bean.JdbcProperties;
import com.weison.spring.resource.properties.bean.JdbcXmlProperty;
import com.weison.spring.resource.properties.bean.JdbcYmlProperty;
import com.weison.spring.resource.properties.config.JdbcPropertiesConfiguration;
import com.weison.spring.resource.properties.config.JdbcXmlConfiguration;
import com.weison.spring.resource.properties.config.JdbcYmlConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Slf4j
public class PropertySourcePropertiesApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcPropertiesConfiguration.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(log::info);

        JdbcProperties bean = context.getBean(JdbcProperties.class);
        log.info("--properties-->" + bean.toString());


        ApplicationContext context1 = new AnnotationConfigApplicationContext(JdbcXmlConfiguration.class);
        String[] beanDefinitionNames1 = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames1).forEach(log::info);

        JdbcXmlProperty bean1 = context1.getBean(JdbcXmlProperty.class);
        log.info("--xml-->" + bean1.toString());


        ApplicationContext context2 = new AnnotationConfigApplicationContext(JdbcYmlConfiguration.class);
        String[] beanDefinitionNames2 = context2.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames2).forEach(log::info);

        JdbcYmlProperty bean2 = context2.getBean(JdbcYmlProperty.class);
        log.info("--yml-->" + bean2.toString());

    }
}
