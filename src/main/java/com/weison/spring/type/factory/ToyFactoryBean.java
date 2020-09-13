package com.weison.spring.type.factory;

import com.weison.spring.type.beans.bean.Ball;
import com.weison.spring.type.beans.bean.Car;
import com.weison.spring.type.beans.bean.Child;
import com.weison.spring.type.beans.bean.Toy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;

/**
 * FactoryBean 本身的加载是伴随IOC容器的初始化时机一起的
 * FactoryBean 生产Bean的机制是延迟生产
 *
 * @author Weison
 * @date 2020/9/9
 */@Slf4j
public class ToyFactoryBean implements FactoryBean<Toy> {

    private Child child;

    public ToyFactoryBean() {
       log.info("ToyFactoryBean 初始化了。。。");
    }

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                // SpringFramework2.0开始允许返回null
                // 之前的1.x版本是不允许的
                return null;
        }
    }

    @Override
    public Class<Toy> getObjectType() {
        return Toy.class;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
