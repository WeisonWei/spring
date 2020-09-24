package com.weison.spring.ioc.profile.annotation;

import com.weison.spring.ioc.profile.config.BartenderConfiguration;
import com.weison.spring.ioc.profile.registrar.WaiterRegistrar;
import com.weison.spring.ioc.profile.selector.BarImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Weison
 * @date 2020/9/21
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//@Import(Boss.class)
//@Import({Boss.class, BartenderConfiguration.class})
//@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class})
//@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
@Import({BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class}) //添加去掉Boss看效果
public @interface EnableTavern {

    /*
     * 模块装配的核心原则：自定义注解 + @Import 导入组件
     * 标注了 @EnableTavern 注解，就会触发 @Import 的效果，向容器中导入一个 Boss 类型的 Bean
     * @Import 的四种导入的方式也就全部过了一遍，模块装配说白了就是这四种方式的综合使用。
     *
     */

}
