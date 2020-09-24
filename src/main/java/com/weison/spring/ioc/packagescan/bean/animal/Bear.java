package com.weison.spring.ioc.packagescan.bean.animal;

import com.weison.spring.ioc.packagescan.annotation.Animal;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author Weison
 * @date 2020/9/24
 */
@Data
@Animal
@Component
public class Bear {
    private String name;
}
