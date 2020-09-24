package com.weison.spring.ioc.annotation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author weison
 * @description Fish beans
 * @date 20-9-6 下午6:59
 * @see
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Fish {

    @Value("${fish.name}")
    private String name;

}
