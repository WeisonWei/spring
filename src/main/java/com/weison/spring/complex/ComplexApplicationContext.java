package com.weison.spring.complex;

import com.weison.spring.complex.bean.Class;
import com.weison.spring.complex.bean.Student;
import com.weison.spring.complex.bean.StudentLog;
import com.weison.spring.complex.bean.Teacher;
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
public class ComplexApplicationContext {

    /**
     * @Autowired注入的原理逻辑 @Autowired 是按照类型注入
     * 由此可以总结出 @Autowired 的注入逻辑：（以下答案仅供参考，可根据自己的理解调整回答内容）
     * 先拿属性对应的类型，去 IOC 容器中找 Bean ，如果找到了一个，直接返回；如果找到多个类型一样的 Bean ，
     * 把属性名拿过去，跟这些 Bean 的 id 逐个对比，如果有一个相同的，直接返回；
     * 如果没有任何相同的 id 与要注入的属性名相同，则会抛出 NoUniqueBeanDefinitionException 异常。
     *
     * JSR250-@Resource 是直接按照属性名 / Bean的名称注入 当于标注 @Autowired 和 @Qualifier
     *
     * JSR330-@Inject 根据类型注入
     *
     * @param args
     */

    public static void main(String[] args) {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Class aClass = (Class) context1.getBean("classTwo");
        Teacher musicTeacher = (Teacher) context1.getBean("musicTeacher");
        Teacher englishTeacher = (Teacher) context1.getBean("englishTeacher");
        Student student1 = (Student) context1.getBean("studentOne");
        StudentLog studentLog =  context1.getBean(StudentLog.class);

        //把@Component("master") 注销
        log.info("aClass-->" + aClass);
        log.info("musicTeacher-->" + musicTeacher);
        log.info("englishTeacher-->" + englishTeacher);
        log.info("student1-->" + student1);
        log.info("studentLog-->" + studentLog);

    }

}
