package com.weison.spring.ioc.complex.beans.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 06
 * @see
 */
@Data
@Component("master")
public class MasterTeacher {

    @Value("李老师")
    private String name;
    @Value("16")
    private Integer age;
    @Autowired(required = false)
    @Qualifier("littleClass")
    private ClassBean aClass;

}
