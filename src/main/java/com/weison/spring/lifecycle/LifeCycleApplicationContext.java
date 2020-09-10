package com.weison.spring.lifecycle;

import com.weison.spring.lifecycle.bean.Girl;
import com.weison.spring.lifecycle.config.LifeCycleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 11
 * @see
 */
public class LifeCycleApplicationContext {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        Girl girl = applicationContext.getBean(Girl.class);
    }

}
