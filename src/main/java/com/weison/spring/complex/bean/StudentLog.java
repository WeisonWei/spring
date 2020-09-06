package com.weison.spring.complex.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 06
 * @see
 */
@Data
@Component
public class StudentLog {

    @Value("二宝")
    private String name;
    @Value("3")
    private Integer age;

    @Autowired
    private List<Class> aClass;

    @Autowired
    private List<Teacher> teachers;
}
