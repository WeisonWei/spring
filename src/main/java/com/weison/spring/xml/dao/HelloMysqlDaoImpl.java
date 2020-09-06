package com.weison.spring.xml.dao;

import java.util.Arrays;
import java.util.List;


public class HelloMysqlDaoImpl implements HelloDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("mysql1", "mysql2", "mysql3");
    }

    @Override
    public List<String> getAll() {
        return Arrays.asList("mysql4", "mysql5", "mysql6");
    }

}

