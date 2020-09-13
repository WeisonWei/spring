package com.weison.spring.xml.dao;

import java.util.Arrays;
import java.util.List;

public class HelloOracleDaoImpl implements HelloDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("oracle1", "oracle2", "oracle3");
    }

    @Override
    public List<String> getAll() {
        return Arrays.asList("oracle4", "oracle5", "oracle6");
    }

}
