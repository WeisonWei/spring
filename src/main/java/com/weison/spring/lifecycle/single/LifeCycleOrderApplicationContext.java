package com.weison.spring.lifecycle.single;

import com.weison.spring.lifecycle.single.config.LifeCycleOrderConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weison
 * @description 执行顺序：@PostConstruct → InitializingBean → init-method
 * @date 2020 09 11
 * @see
 */
@Slf4j
public class LifeCycleOrderApplicationContext {

    /**
     * 在 IOC 容器初始化之前，默认情况下 Bean 已经创建好了，而且完成了初始化动作；
     * 容器调用销毁动作时，先销毁所有 Bean ，最后 IOC 容器全部销毁完成
     *
     * @param args
     */
    public static void main(String[] args) {

        log.info("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleOrderConfig.class);
        log.info("IOC容器初始化完成。。。");

        log.info("------->");

        log.info("准备销毁IOC容器。。。");
        context.close();
        log.info("IOC容器销毁完成。。。");
    }

}
