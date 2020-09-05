package com.weison.dao;

import java.util.Arrays;
import java.util.List;

public class HelloDaoImpl implements HelloDao{

    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
