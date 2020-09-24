package com.weison.spring.ioc.packagescan.bean;

import java.util.Arrays;
import java.util.List;

public class HelloDaoImpl {

    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }

    public List<String> getAll() {
        return Arrays.asList("ddd", "eee", "fff");
    }

}
