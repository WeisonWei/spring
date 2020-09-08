package com.weison.spring.complex.beans.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 06
 * @see
 */
@Data
@Component("littleClass")
public class ClassBean {

    @Value("小小年纪")
    private String grade;
    @Value("小小班")
    private String name;

}
