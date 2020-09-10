package com.weison.spring.lifecycle;

import com.weison.spring.lifecycle.config.LifeCycleConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 11
 * @see
 */
@Slf4j
public class LifeCycleApplicationContext {

    public static void main(String[] args) {


        log.info("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        log.info("IOC容器初始化完成。。。");

        log.info("------->");

        log.info("准备销毁IOC容器。。。");
        context.close();
        log.info("IOC容器销毁完成。。。");
    }

}
