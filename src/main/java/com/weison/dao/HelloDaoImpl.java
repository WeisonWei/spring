package com.weison.dao;

import java.util.Arrays;
import java.util.List;

public class HelloDaoImpl implements HelloDao{

    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }

    @Override
    public List<String> getAll() {
        return Arrays.asList("ddd", "eee", "fff");
    }

}
