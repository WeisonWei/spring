package com.weison.spring.ioc.type.config;

import com.weison.spring.ioc.type.beans.bean.Ball;
import com.weison.spring.ioc.type.beans.bean.Car;
import com.weison.spring.ioc.type.beans.bean.Child;
import com.weison.spring.ioc.type.factory.ToyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * @author Weison
 * @date 2020/9/9
 */
public class BeanConfig {

    @Bean
    public Child littleChild() {
        return new Child();
    }

    @Bean
    public Car redCar() {
        return new Car("redCar");
    }

    @Bean
    public Ball blackBall() {
        return new Ball("blackBall");
    }

    @Bean
    @Autowired
    public ToyFactoryBean toyFactory(Child child) {
        ToyFactoryBean toyFactory = new ToyFactoryBean();
        toyFactory.setChild(child);
        return toyFactory;
    }
}
