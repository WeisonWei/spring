package com.weison.spring.annotation;

import com.weison.spring.annotation.bean.Mermaid;
import com.weison.spring.annotation.config.ImportXmlAnnotationConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@Slf4j
public class XmlAnnotationApplicationContext {

    public static void main(String[] args) {
        //1 获取@Component @Controller @Service 等bean注解 配合 @ComponentScan使用
        //此处已经配置扫描包全限定名 不需要使用@ComponentScan 也能加载
        ApplicationContext context = new AnnotationConfigApplicationContext(ImportXmlAnnotationConfiguration.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Arrays.stream(beanDefinitionNames).forEach(name -> log.info("-1->" + name));

        //TODO 未读取到值
        Mermaid mermaid = context.getBean(Mermaid.class);
        log.info("---XmlAnnotationApplicationContext---");
    }

}
