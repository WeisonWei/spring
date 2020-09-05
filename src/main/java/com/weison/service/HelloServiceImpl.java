package com.weison.service;

import com.weison.dao.HelloDao;
import com.weison.dao.HelloDaoImpl;

import java.util.List;

public class HelloServiceImpl implements HelloService{

    private HelloDao demoDao = new HelloDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }

}
