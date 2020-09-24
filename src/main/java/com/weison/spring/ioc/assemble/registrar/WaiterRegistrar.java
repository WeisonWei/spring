package com.weison.spring.ioc.assemble.registrar;

import com.weison.spring.ioc.assemble.bean.Waiter;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Weison
 * @date 2020/9/21
 */
public class WaiterRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * 如果说ImportSelector更像声明式导入的话，那ImportBeanDefinitionRegistrar就可以解释为编程式向IOC容器中导入 Bean 。
     * 不过由于它导入的实际是 BeanDefinition （ Bean 的定义信息），
     * @param metadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
    }

}
