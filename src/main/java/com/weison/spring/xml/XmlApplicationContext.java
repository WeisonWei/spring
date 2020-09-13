package com.weison.spring.xml;

import com.weison.spring.xml.annotation.Life;
import com.weison.spring.xml.bean.Pig;
import com.weison.spring.xml.dao.HelloDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

@Slf4j
public class XmlApplicationContext {

    /**
     * org.springframework.beans 和 org.springframework.context 包是 SpringFramework 的 IOC 容器的基础。
     * BeanFactory 接口提供了一种高级配置机制，能够管理任何类型的对象。
     * ApplicationContext 是 BeanFactory 的子接口。它
     * <p>
     * 增加了：
     * 与 SpringFramework 的 AOP 功能轻松集成
     * 消息资源处理（用于国际化）
     * 事件发布
     * 应用层特定的上下文，例如 Web 应用程序中使用的 WebApplicationContext
     * <p>
     * 总结：ApplicationContext包含BeanFactory的所有功能，并且人家还扩展了好多特性。
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-inject/spring.xml");

        //1 按类型获取所有
        Map<String, HelloDao> beansOfType = context.getBeansOfType(HelloDao.class);
        beansOfType.forEach((key, value) -> log.info("-->" + value));
        log.info("---getBeansOfType---");

        //2 按注解获取所有
        Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(Life.class);
        beansWithAnnotation.forEach((key, value) -> log.info("-->" + value));
        log.info("---getBeansWithAnnotation---");


        //3 按注解获取所有bean name
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(name -> log.info("-->" + name));
        log.info("---getBeanDefinitionNames---");


        // 下面的代码会报Bean没有定义 NoSuchBeanDefinitionException
        //Pig pig = context.getBean(Pig.class);

        // 这一行代码不会报错
        ObjectProvider<Pig> pigProvider = context.getBeanProvider(Pig.class);
        Pig ifAvailable = pigProvider.getIfAvailable(Pig::new);
        log.info("---ifAvailable---{}", ifAvailable);
        log.info("---getBeanProvider---");

    }

}
