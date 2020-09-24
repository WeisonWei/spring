package com.weison.spring.ioc.assemble.selector;

import com.weison.spring.ioc.assemble.bean.Bar;
import com.weison.spring.ioc.assemble.config.BarConfiguration;
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
