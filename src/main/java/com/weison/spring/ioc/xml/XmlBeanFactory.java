package com.weison.spring.ioc.xml;

import com.weison.spring.ioc.xml.bean.Cat;
import com.weison.spring.ioc.xml.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class XmlBeanFactory {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-inject/beans-by-name.xml");
        Person person = (Person) beanFactory.getBean("person");
        Person person1 = beanFactory.getBean(Person.class);

        log.info("=person={}", person);
        log.info("=person1={}", person1);


        BeanFactory beanFactory1 = new ClassPathXmlApplicationContext("bean-inject/beans-by-name.xml");
        Person person3 = (Person) beanFactory1.getBean("person");
        Person person4 = beanFactory1.getBean(Person.class);
        log.info("=person3={}", person3);
        log.info("=person4={}", person4);


        BeanFactory beanFactory2 = new ClassPathXmlApplicationContext("bean-inject/inject-set.xml");
        Person person5 = beanFactory2.getBean(Person.class);
        System.out.println(person5);

        Cat cat = beanFactory2.getBean(Cat.class);
        System.out.println(cat);
    }

}
