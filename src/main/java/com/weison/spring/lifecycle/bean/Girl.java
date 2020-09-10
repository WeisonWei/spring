package com.weison.spring.lifecycle.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author weison
 * @description TODO
 * @date 2020 09 11
 * @see
 */
@Data
@Slf4j
public class Girl {

    private String name;

    public void init() {
        log.info(name + "被初始化了。。。");
    }

    public void destroy() {
        log.info(name + "被销毁了。。。");
    }
}
