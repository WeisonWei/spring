package com.weison.spring.ioc.aware.beans.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Weison
 * @date 2020/9/9
 */
@Slf4j
@Component
public class Dog {

    private Person person;

    @Autowired
    public void setPerson(ObjectProvider<Person> person) {
        log.info("--setPerson-->" + person.getIfUnique().toString());
        // 有Bean才取出，注入
        this.person = person.getIfAvailable();

    }

}
