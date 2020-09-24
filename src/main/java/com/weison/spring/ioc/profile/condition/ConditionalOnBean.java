package com.weison.spring.ioc.profile.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author Weison
 * @date 2020/9/22
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnBeanCondition.class)
public @interface ConditionalOnBean {

    Class<?>[] value() default {};

    String[] beanNames() default {};

}
