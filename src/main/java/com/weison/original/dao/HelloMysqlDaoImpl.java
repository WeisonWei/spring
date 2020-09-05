package com.weison.original.dao;

import java.util.Arrays;
import java.util.List;


public class HelloMysqlDaoImpl implements HelloDao{

    @Override
    public List<String> findAll() {
        return Arrays.asList("mysqlData", "mysqlData1", "mysqlData2");
    }

    @Override
    public List<String> getAll() {
        return Arrays.asList("mysqlData3", "mysqlData4", "mysqlData5");
    }

}

