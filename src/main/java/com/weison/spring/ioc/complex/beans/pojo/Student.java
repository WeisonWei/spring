package com.weison.spring.ioc.complex.beans.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 06
 * @see
 */
@Data
public class Student {

    private String name;
    private Integer age;
    private List<Class> classes;
    private List<Teacher> teachers;

}
