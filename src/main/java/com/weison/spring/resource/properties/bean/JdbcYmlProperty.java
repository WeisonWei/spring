package com.weison.spring.resource.properties.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Data
@Component
public class JdbcYmlProperty {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driver-class-name}")
    private String driverClassName;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;
}
