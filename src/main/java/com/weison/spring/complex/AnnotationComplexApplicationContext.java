package com.weison.spring.complex;

import com.weison.spring.complex.beans.pojo.Class;
import com.weison.spring.complex.beans.pojo.Student;
import com.weison.spring.complex.beans.pojo.Teacher;
import com.weison.spring.complex.config.InjectComplexFieldConfiguration;
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
public class AnnotationComplexApplicationContext {

    /**
     * @param args
     * @Autowired注入的原理逻辑 @Autowired 是按照类型注入
     * 由此可以总结出 @Autowired 的注入逻辑：（以下答案仅供参考，可根据自己的理解调整回答内容）
     * 先拿属性对应的类型，去 IOC 容器中找 Bean ，如果找到了一个，直接返回；如果找到多个类型一样的 Bean ，
     * 把属性名拿过去，跟这些 Bean 的 id 逐个对比，如果有一个相同的，直接返回；
     * 如果没有任何相同的 id 与要注入的属性名相同，则会抛出 NoUniqueBeanDefinitionException 异常。
     * <p>
     * JSR250-@Resource 是直接按照属性名 / Bean的名称注入 当于标注 @Autowired 和 @Qualifier
     * <p>
     * JSR330-@Inject 根据类型注入 @Inject 等同于@Autowired  @Named("admin") 等同于@Qualifier
     */

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Class classOne = (Class) context.getBean("classOne");
        Class classTwo = (Class) context.getBean("classTwo");
        Teacher musicTeacher = (Teacher) context.getBean("musicTeacher");
        Teacher englishTeacher = (Teacher) context.getBean("englishTeacher");
        Student student = (Student) context.getBean("studentOne");

        log.info("classOne-->" + classOne);
        log.info("classTwo-->" + classTwo);
        log.info("musicTeacher-->" + musicTeacher);
        log.info("englishTeacher-->" + englishTeacher);
        log.info("student-->" + student);

    }

}
