package com.weison.spring.assemble.selector;

import com.weison.spring.assemble.bean.Bar;
import com.weison.spring.assemble.config.BarConfiguration;
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
