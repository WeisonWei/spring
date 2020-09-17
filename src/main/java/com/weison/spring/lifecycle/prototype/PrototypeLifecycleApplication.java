package com.weison.spring.lifecycle.prototype;

import com.weison.spring.lifecycle.prototype.bean.Pen;
import com.weison.spring.lifecycle.prototype.config.PrototypeLifecycleConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Weison
 * @date 2020/9/17
 */
public class PrototypeLifecycleApplication {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                PrototypeLifecycleConfiguration.class);
        System.out.println("IOC容器初始化完成。。。");

        //原型Bean的初始化动作与单实例Bean完全一致
        System.out.println("准备获取一个Pen。。。");
        Pen pen = ctx.getBean(Pen.class);
        System.out.println("已经取到了Pen。。。");

        //原型 Bean 在销毁时不处理 destroy-method 标注的方法
        System.out.println("用完Pen了，准备销毁。。。");
        ctx.getBeanFactory().destroyBean(pen);
        System.out.println("Pen销毁完成。。。");
    }
}
