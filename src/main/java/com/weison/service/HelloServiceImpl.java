package com.weison.service;

import com.weison.dao.HelloDao;
import com.weison.util.BeanFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Slf4j
public class HelloServiceImpl implements HelloService {

    //private HelloDao helloDao = new HelloDaoImpl();
    private BeanFactory beanFactory = new BeanFactory();
    private HelloDao helloDaoImpl = (HelloDao) BeanFactory.getBean("helloDaoImpl");
    private HelloDao helloMysqlDaoImpl = (HelloDao) BeanFactory.getBean("helloMysqlDaoImpl");
    private HelloDao helloDao = (HelloDao) BeanFactory.getBeanCache("helloMysqlDaoImpl");
    private HelloDao helloMysqlDao = (HelloDao) BeanFactory.getBeanCache("helloMysqlDaoImpl");

    @Override
    public List<String> findAll(String db) {
        if (isNotBlank(db) && db.equals("mysql"))
            return beanFactory.getHelloDao("mysql").findAll();
        return beanFactory.getHelloDao(null).findAll();
    }

    @Override
    public List<String> getAll(String db) {
        if (isNotBlank(db) && db.equals("mysql"))
            return beanFactory.getHelloDaoNew("mysql").getAll();
        return beanFactory.getHelloDaoNew(null).getAll();
    }

    @Override
    public List<String> get(String db) {
        //beanFactory.getBean("helloDao");
        if (isNotBlank(db) && db.equals("mysql"))
            return helloMysqlDaoImpl.getAll();
        return helloDaoImpl.getAll();
    }

    @Override
    public List<Object> getBeans() {
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Object demoDao = BeanFactory.getBean("helloDaoImpl");
            list.add(demoDao);
        }
        log.info("==" + list);
        return list;
    }

    /**
     * 总结一下这里面出现的几个关键点
     *
     * 1.静态工厂可将多处依赖抽取分离
     * 2.外部化配置文件+反射可解决配置的硬编码问题
     * 3.缓存可控制对象实例数
     * @return
     */

    /**
     * 仔细体会下面这种对象获取的方式,本来可以使用上面的方式：
     * 主动声明实现类,但如果选择下面的方式,那就不再是咱自己去声明,而是将获取对象的方式交给了 BeanFactory。
     * 这种将控制权交给别人的思想,就可以称作：控制反转（ Inverse of Control , IOC ）。
     * 而 BeanFactory 根据指定的 beanName 去获取和创建对象的过程,就可以称作：依赖查找（ Dependency Lookup , DL ）。
     * @return
     */
    @Override
    public List<Object> getCacheBeans() {
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Object demoDao = BeanFactory.getBeanCache("helloDaoImpl");
            list.add(demoDao);
        }
        log.info("==" + list);
        return list;
    }

}
