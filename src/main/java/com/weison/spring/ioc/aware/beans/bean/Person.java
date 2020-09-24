package com.weison.spring.ioc.aware.beans.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Weison
 * @date 2020/9/9
 */
@Data
@Component
public class Person {

    @Value("隔壁老王")
    private String name;

    @Value("18")
    private Integer age;

}
