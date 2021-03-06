package com.weison.spring.ioc.profile.selector;

import com.weison.spring.ioc.profile.bean.Bar;
import com.weison.spring.ioc.profile.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Weison
 * @date 2020/9/21
 */
public class BarImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
    }

}
