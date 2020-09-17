package com.weison.spring.listener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weixiaoxing
 * @date 2020/9/17
 */
public class QuickstartListenerApplication {

    public static void main(String[] args) throws Exception {
        System.out.println("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                "com.weison.spring.listener");
        System.out.println("IOC容器初始化完成。。。");
        ctx.close();
        System.out.println("IOC容器关闭。。。");
    }
}