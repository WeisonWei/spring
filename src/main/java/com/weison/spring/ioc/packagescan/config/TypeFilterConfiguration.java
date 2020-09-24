package com.weison.spring.ioc.packagescan.config;

import com.weison.spring.ioc.packagescan.annotation.Animal;
import com.weison.spring.ioc.packagescan.beanfilter.YellowTypeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Configuration
@ComponentScan(
        basePackages = "com.weison.spring.ioc.packagescan.bean",
        useDefaultFilters = true, //默认true
        //includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class),
        //includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.weison.spring.ioc.packagescan.bean.e.+"),
        //includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Color.class)},
        //excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Color.class)
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Animal.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM, value = YellowTypeFilter.class)}
)
public class TypeFilterConfiguration {

}
