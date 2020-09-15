package com.weison.spring.lifecycle.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Weison
 * @date 2020/9/14
 */
@Slf4j
@Data
public class WhiteGirl {
    private String name;

    @PostConstruct
    public void born() {
        log.info("一个白人小姑凉出生了。。。");
    }

    @PreDestroy
    public void dead() {
        log.info("一个白人女同志去世了。。。");
    }
}
