package com.weison.spring.complex;

import com.weison.spring.complex.beans.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author weison
 * @description 通过xml 复杂数据结构的注入:对象 数组 列表 等
 * @date 2020 09 06
 * @see
 */
@Slf4j
public class XmlComplexApplicationContext {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-inject/inject-set.xml");

        Student student = (Student) context.getBean("student");
        log.info("student-->" + student);

    }

}
