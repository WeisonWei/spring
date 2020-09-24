package com.weison.spring.ioc.assemble;

import com.weison.spring.ioc.assemble.bean.Bartender;
import com.weison.spring.ioc.assemble.config.TavernConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.stream.Stream;

/**
 * @author Weison
 * @date 2020/9/21
 */
@Slf4j
public class TavernApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
        //Boss boss = ctx.getBean(Boss.class);
        //log.info(boss.toString());


        Stream.of(ctx.getBeanDefinitionNames()).forEach(log::info);
        System.out.println("--------------------------");
        Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
        bartenders.forEach((name, bartender) -> System.out.println(bartender));
    }

}
