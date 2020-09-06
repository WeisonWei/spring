package com.weison.spring.xml.dao;

import java.util.Arrays;
import java.util.List;

public class HelloH2DaoImpl implements HelloDao {

    @Override
    public List<String> findAll() {
        return Arrays.asList("h21", "h22", "h23");
    }

    @Override
    public List<String> getAll() {
        return Arrays.asList("h24", "h25", "h26");
    }

}
