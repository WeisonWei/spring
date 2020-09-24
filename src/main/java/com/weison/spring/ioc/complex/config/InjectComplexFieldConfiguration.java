package com.weison.spring.ioc.complex.config;

import com.weison.spring.ioc.complex.beans.pojo.Class;
import com.weison.spring.ioc.complex.beans.pojo.Student;
import com.weison.spring.ioc.complex.beans.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 06
 * @see
 */
@Configuration
public class InjectComplexFieldConfiguration {


    @Primary
    @Bean("littleClass")
    public Class littleClass() {
        Class aClass = new Class();
        aClass.setGrade("小小班");
        aClass.setName("小小班");
        return aClass;
    }

    @Bean("classOne")
    public Class classOne() {
        Class aClass = new Class();
        aClass.setGrade("小班");
        aClass.setName("一班");
        return aClass;
    }

    @Bean("classTwo")
    public Class classTwo() {
        Class aClass = new Class();
        aClass.setGrade("大班");
        aClass.setName("二班");
        return aClass;
    }

    @Bean("musicTeacher")
    public Teacher musicTeacher(@Autowired @Qualifier("classOne") Class aClass) {
        Teacher teacher = new Teacher();
        teacher.setName("音乐老师");
        teacher.setAge(21);
        teacher.setAClass(aClass);
        return teacher;
    }

    @Bean("englishTeacher")
    public Teacher englishTeacher(@Autowired @Qualifier("classTwo") Class aClass) {
        Teacher teacher = new Teacher();
        teacher.setName("英语老师");
        teacher.setAge(22);
        teacher.setAClass(aClass);
        return teacher;
    }

    @Bean("studentOne")
    public Student studentOne(@Autowired List<Class> aClass, @Autowired List<Teacher> teachers) {
        Student student = new Student();
        student.setName("小明");
        student.setAge(4);
        student.setClasses(aClass);
        student.setTeachers(teachers);
        return student;
    }

}
