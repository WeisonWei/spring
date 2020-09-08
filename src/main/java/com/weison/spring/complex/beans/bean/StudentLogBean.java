package com.weison.spring.complex.beans.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author weison
 * @description 学生班级升级日志
 * @date 2020 09 06
 * @see
 */
@Data
@Component
public class StudentLogBean {

    @Value("二宝")
    private String name;
    @Value("3")
    private Integer age;

    @Autowired(required = false)
    private List<ClassBean> classes;

    @Autowired(required = false)
    private List<TeacherBean> teachers;
}
