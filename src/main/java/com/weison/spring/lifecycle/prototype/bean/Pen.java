package com.weison.spring.lifecycle.prototype.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Weison
 * @date 2020/9/15
 */
@Slf4j
@Component
public class Pen implements InitializingBean, DisposableBean {

    private Integer ink;

    public void open() {
        log.info("init-method - 打开钢笔。。。");
    }

    public void close() {
        log.info("destroy-method - 合上钢笔。。。");
    }

    @PostConstruct
    public void addInk() {
        log.info("@PostConstruct - 钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outWellInk() {
        log.info("@PreDestroy - 钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("InitializingBean - 准备写字。。。");
    }

    @Override
    public void destroy() throws Exception {
        log.info("DisposableBean - 写完字了。。。");
    }
}
