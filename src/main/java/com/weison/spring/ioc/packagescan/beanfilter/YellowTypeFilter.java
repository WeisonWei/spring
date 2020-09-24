package com.weison.spring.ioc.packagescan.beanfilter;

import com.weison.spring.ioc.packagescan.bean.color.Yellow;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author Weison
 * @date 2020/9/24
 */
public class YellowTypeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        return classMetadata.getClassName().equals(Yellow.class.getName());
    }
}
