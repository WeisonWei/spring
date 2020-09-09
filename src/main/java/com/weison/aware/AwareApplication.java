package com.weison.aware;

import com.weison.aware.beans.bean.Dog;
import com.weison.aware.config.AwareConfiguration;
import com.weison.aware.config.BeanAware;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Weison
 * @date 2020/9/8
 */
@Data
@Slf4j
public class AwareApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(log::info);

        Dog dog = (Dog) applicationContext.getBean("dog");
        log.info("--dog-->{}", dog);

        BeanAware bean = applicationContext.getBean(BeanAware.class);
        bean.printBeanNames();
    }
}
