package com.weison.spring.ioc.lifecycle.single;

import com.weison.spring.ioc.lifecycle.single.config.LifeCycleConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weison
 * @description JSR250  @PostConstruct 、@PreDestroy 、@Resource
 * @PostConstruct init-method
 * @PreDestroy destroy-method
 * @date 2020 09 11
 * @see
 */
@Slf4j
public class LifeCycleApplicationContext {

    /**
     * 在 IOC 容器初始化之前，默认情况下 Bean 已经创建好了，而且完成了初始化动作；
     * 容器调用销毁动作时，先销毁所有 Bean ，最后 IOC 容器全部销毁完成
     * @param args
     */
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
