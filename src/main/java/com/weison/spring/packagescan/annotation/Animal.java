package com.weison.spring.packagescan.annotation;

import java.lang.annotation.*;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Animal {
}
