package com.weison.spring.complex;

import com.weison.spring.complex.bean.MasterTeacher;
import com.weison.spring.complex.bean.Student;
import com.weison.spring.complex.bean.StudentLog;
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
     * @Autowired注入的原理逻辑
     * 由此可以总结出 @Autowired 的注入逻辑：（以下答案仅供参考，可根据自己的理解调整回答内容）
     * 先拿属性对应的类型，去 IOC 容器中找 Bean ，如果找到了一个，直接返回；如果找到多个类型一样的 Bean ，
     * 把属性名拿过去，跟这些 Bean 的 id 逐个对比，如果有一个相同的，直接返回；
     * 如果没有任何相同的 id 与要注入的属性名相同，则会抛出 NoUniqueBeanDefinitionException 异常。
     * @param args
     */

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        //Class aClass = context.getBean(Class.class);
        //log.info("aClass-->" + aClass);

        MasterTeacher teacher = context.getBean(MasterTeacher.class);
        Student student = context.getBean(Student.class);
        StudentLog studentLog = context.getBean(StudentLog.class);
        log.info("teacher-->" + teacher);
        log.info("student-->" + student);
        log.info("studentLog-->" + studentLog);

    }

}
