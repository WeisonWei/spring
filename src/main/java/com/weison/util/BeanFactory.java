package com.weison.util;

import com.weison.dao.HelloDao;
import com.weison.dao.HelloDaoImpl;
import com.weison.dao.HelloMysqlDaoImpl;
import lombok.SneakyThrows;

public class BeanFactory {

    public static HelloDao getHelloDao(String name) {
        if ("mysql".equals(name))
            return new HelloMysqlDaoImpl();
        return new HelloDaoImpl();
    }

    public static HelloDao getHelloDaoNew(String name) {
        if ("mysql".equals(name)) {
            return getDao("com.weison.dao.HelloMysqlDaoImpl");
        }
        return getDao("com.weison.dao.HelloDaoImpl");

    }


    @SneakyThrows
    private static HelloDao getDao(String s) {
        return (HelloDao) Class.forName(s).newInstance();
    }

}
