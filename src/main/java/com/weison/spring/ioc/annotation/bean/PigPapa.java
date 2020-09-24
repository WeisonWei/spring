package com.weison.spring.ioc.annotation.bean;

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
public class PigPapa {
    /**
     * SpEL 全称 Spring Expression Language ，它从 SpringFramework 3.0 开始被支持，
     * 它本身可以算 SpringFramework 的组成部分，但又可以被独立使用。
     * 它可以支持调用属性值、属性参数以及方法调用、数组存储、逻辑计算等功能。
     * <p>
     * SpEL 的语法统一用 #{} 表示，花括号内部编写表达式语言。
     */

    @Value("#{pig.name +'她爹'}")
    private String name;

    @Value("#{1}")
    private Integer order;
}
