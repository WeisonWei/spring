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
public class JdbcXmlProperty {

    @Value("${xml.jdbc.url}")
    private String url;

    @Value("${xml.jdbc.driver-class-name}")
    private String driverClassName;

    @Value("${xml.jdbc.username}")
    private String username;

    @Value("${xml.jdbc.password}")
    private String password;

}
