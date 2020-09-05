package com.weison.spring;

import com.weison.spring.bean.Cat;
import com.weison.spring.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class InjectBeansByXmlApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext nameContext = new ClassPathXmlApplicationContext("bean-inject/beans-by-name.xml");
        Person person = (Person) nameContext.getBean("person");
        Person person1 = nameContext.getBean(Person.class);

        log.info("=person={}", person);
        log.info("=person1={}", person1);


        ClassPathXmlApplicationContext typeContext = new ClassPathXmlApplicationContext("bean-inject/beans-by-name.xml");
        Person person3 = (Person) nameContext.getBean("person");
        Person person4 = typeContext.getBean(Person.class);
        log.info("=person3={}", person3);
        log.info("=person4={}", person4);


        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-inject/inject-set.xml");
        Person person5 = beanFactory.getBean(Person.class);
        System.out.println(person5);

        Cat cat = beanFactory.getBean(Cat.class);
        System.out.println(cat);
    }
}
