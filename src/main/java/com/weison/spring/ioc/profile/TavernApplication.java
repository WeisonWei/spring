package com.weison.spring.ioc.profile;

import com.weison.spring.ioc.profile.config.TavernConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @author Weison
 * @date 2020/9/21
 */
@Slf4j
public class TavernApplication {

    public static void main(String[] args) {

        //1 无 张三 李四
        //在 new AnnotationConfigApplicationContext 的时候，如果传入了配置类，它内部就自动初始化完成了，那些 Bean 也就都创建好了
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);

        //2 有 张三李四
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("city");
        ctx.register(TavernConfiguration.class);
        ctx.refresh();
        System.out.println("-------------1-------------");
        Stream.of(ctx.getBeanDefinitionNames()).forEach(log::info);
        System.out.println("-------------2-------------");
    }
}
