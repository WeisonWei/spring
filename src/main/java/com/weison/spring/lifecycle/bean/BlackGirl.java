package com.weison.spring.lifecycle.bean;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Weison
 * @date 2020/9/14
 */
@Slf4j
@Data
@Accessors(chain = true)
public class BlackGirl {
    private String name;

    @PostConstruct
    public void born() {
        log.info("一个黑人小姑凉出生了。。。");
    }

    public void grow() {
        log.info("一个黑人小姑凉长大了。。。");
    }

    public void getBaby() {
        log.info("一个黑人小姑凉结婚生子了。。。");
    }

    @PreDestroy
    public void dead() {
        log.info("一个黑人女同志去世了。。。");
    }
}
