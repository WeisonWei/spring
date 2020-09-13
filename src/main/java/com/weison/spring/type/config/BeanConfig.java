package com.weison.spring.type.config;

import com.weison.spring.type.beans.bean.Ball;
import com.weison.spring.type.beans.bean.Car;
import com.weison.spring.type.beans.bean.Child;
import com.weison.spring.type.factory.ToyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

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
