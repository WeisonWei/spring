package com.weison.spring.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * @author Weison
 * @date 2020/9/22
 */
public class DataSourceConfiguration {

    /**
     * 注解 + 外部配置文件，就可以做到只切换 profile 即可切换不同的数据源。
     * @return
     */

    /**
     * profile 强大吗？当然很强大，但它还有一些无法控制的地方。下面咱把场景进一步复杂化：
     *
     * 吧台应该是由老板安置好的，如果酒馆中连老板都没有，那吧台也不应该存在。
     *
     * 这种情况下，用 profile 就不好使了：因为 profile 控制的是整个项目的运行环境，无法根据单个 Bean 的因素决定是否装配。
     * 也是因为这个问题，出现了第二种条件装配的方式：@Conditional 注解
     * @return
     */
    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return null;
    }

    @Bean
    @Profile("test")
    public DataSource testDataSource() {
        return null;
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        return null;
    }
}
