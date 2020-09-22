package com.weison.spring.profile.condition;

import com.weison.spring.profile.bean.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author Weison
 * @date 2020/9/22
 */
public class ExistBossCondition implements Condition {

    /**
     * 用来判断 IOC 容器中是否存在 Boss 的对象
     *
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getBeanFactory().containsBeanDefinition(Boss.class.getName());
    }
}
