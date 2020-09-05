package com.weison.service;

import com.weison.util.BeanFactory;

import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class HelloServiceImpl implements HelloService {

    //private HelloDao demoDao = new HelloDaoImpl();
    private BeanFactory beanFactory = new BeanFactory();

    @Override
    public List<String> findAll(String db) {
        if (isNotBlank(db) && db.equals("mysql"))
            return beanFactory.getHelloDao("mysql").findAll();
        return beanFactory.getHelloDao(null).findAll();
    }

    @Override
    public List<String> getAll(String db) {
        if (isNotBlank(db) && db.equals("mysql"))
            return beanFactory.getHelloDaoNew("mysql").findAll();
        return beanFactory.getHelloDaoNew(null).findAll();
    }

}
