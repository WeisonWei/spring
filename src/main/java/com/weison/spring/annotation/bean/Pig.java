package com.weison.spring.annotation.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author weison
 * @description SpEL
 * @date 2020 09 06
 * @see
 */
@Data
@Component
public class Pig {
    /**
     * SpEL 全称 Spring Expression Language ，它从 SpringFramework 3.0 开始被支持，
     * 它本身可以算 SpringFramework 的组成部分，但又可以被独立使用。
     * 它可以支持调用属性值、属性参数以及方法调用、数组存储、逻辑计算等功能。
     *
     * SpEL 的语法统一用 #{} 表示，花括号内部编写表达式语言。
     */

    @Value("#{'佩奇'}")
    private String name;

    @Value("#{pig.name.substring(0, 1)}")
    private String familyName;

    @Value("#{pigPapa.order + 1}")
    private Integer order;

    @Value("#{T(java.lang.Integer).MAX_VALUE}")
    private Integer age;
}
