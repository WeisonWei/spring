package com.weison.spring.complex;

import com.weison.spring.complex.beans.bean.*;
import com.weison.spring.complex.config.ComponentScanConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weison
 * @description 复杂数据结构的注入:对象 数组 列表 等
 * @date 2020 09 06
 * @see
 */
@Slf4j
public class SimpleApplicationContext {

    /**
     * @param args
     * @Autowired注入的原理逻辑 由此可以总结出 @Autowired 的注入逻辑：（以下答案仅供参考，可根据自己的理解调整回答内容）
     * 先拿属性对应的类型，去 IOC 容器中找 Bean ，如果找到了一个，直接返回；如果找到多个类型一样的 Bean ，
     * 把属性名拿过去，跟这些 Bean 的 id 逐个对比，如果有一个相同的，直接返回；
     * 如果没有任何相同的 id 与要注入的属性名相同，则会抛出 NoUniqueBeanDefinitionException 异常。
     */

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        ClassBean aClass = context.getBean(ClassBean.class);
        log.info("aClass-->" + aClass);
        ClassBean littleClass = (ClassBean) context.getBean("littleClass");
        log.info("littleClass-->" + littleClass);


        MasterTeacher teacher = context.getBean(MasterTeacher.class);
        StudentBean student = context.getBean(StudentBean.class);
        StudentLogBean studentLog = context.getBean(StudentLogBean.class);
        TeacherLogBean teacherLogBean = (TeacherLogBean) context.getBean("teacherLogBean");

        log.info("teacher-->" + teacher);
        log.info("student-->" + student);
        log.info("studentLog-->" + studentLog);
        log.info("teacherLog-->" + teacherLogBean);

    }

}
