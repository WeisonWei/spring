package com.weison.spring.lifecycle.prototype.config;

import com.weison.spring.lifecycle.prototype.bean.Pen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
 * @author Weison
 * @date 2020/9/17
 */
public class PrototypeLifecycleConfiguration {

    @Bean(initMethod = "open", destroyMethod = "close")
    @Scope(SCOPE_PROTOTYPE)
    public Pen pen() {
        return new Pen();
    }
}
