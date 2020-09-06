package com.weison.spring.complex.config;

import com.weison.spring.complex.bean.Class;
import com.weison.spring.complex.bean.Student;
import com.weison.spring.complex.bean.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 06
 * @see
 */
@Configuration
@ComponentScan(value = "com.weison.spring.complex.bean")
public class InjectComplexFieldConfiguration {

    @Bean("classOne")
    public Class classOne() {
        Class aClass = new Class();
        aClass.setName("一班");
        aClass.setGrade("小班");
        return aClass;
    }

    @Primary
    @Bean("classTwo")
    public Class classTwo() {
        Class aClass = new Class();
        aClass.setName("二班");
        aClass.setGrade("大班");
        return aClass;
    }

    @Bean("musicTeacher")
    @Qualifier("classOne")
    @Autowired
    public Teacher musicTeacher(Class aClass) {
        Teacher teacher = new Teacher();
        teacher.setName("音乐老师");
        teacher.setAge(21);
        teacher.setAClass(aClass);
        return teacher;
    }

    @Bean("englishTeacher")
    @Qualifier("classTwo")
    @Autowired
    public Teacher englishTeacher(Class aClass) {
        Teacher teacher = new Teacher();
        teacher.setName("英语老师");
        teacher.setAge(22);
        teacher.setAClass(aClass);
        return teacher;
    }

    @Bean("studentOne")
    @Qualifier("classTwo")
    public Student studentOne(@Autowired Class aClass) {
        Student student = new Student();
        student.setName("小明");
        student.setAge(4);
        student.setAClass(aClass);
        return student;
    }

}
