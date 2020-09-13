package com.weison.spring.type;

import com.weison.spring.type.beans.bean.Child;
import com.weison.spring.type.config.BeanConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author Weison
 * @date 2020/9/9
 */
@Slf4j
public class BeanTypeAnnoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Child child = applicationContext.getBean(Child.class);
        log.info("-child->" + child);
    }

}
