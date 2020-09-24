package com.weison.spring.ioc.complex.beans.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author weison
 * @description 老师代课日志
 * @date 2020 09 06
 * @see
 */
@Data
@Component
public class TeacherLogBean {

    @Value("韦老师")
    private String name;
    @Value("20")
    private Integer age;
    @Inject // 等同于@Autowired
    @Named("littleClass") // 等同于@Qualifier
    private ClassBean aClass;

}
