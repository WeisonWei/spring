package com.weison.spring.ioc.type.beans.bean;

import lombok.Data;

/**
 * @author Weison
 * @date 2020/9/9
 */
@Data
public class Child {

    // 当前的小孩子想玩球
    private String wantToy = "ball";

    public String getWantToy() {
        return wantToy;
    }
}
