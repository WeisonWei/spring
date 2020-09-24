package com.weison.spring.ioc.type.beans.bean;

/**
 * @author Weison
 * @date 2020/9/9
 */
public abstract class Toy {

    private String name;

    public Toy(String name) {
        System.out.println("生产了一个" + name);
        this.name = name;
    }
}
