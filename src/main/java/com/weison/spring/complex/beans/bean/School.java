package com.weison.spring.complex.beans.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author weison
 * @description School
 * @date 2020 09 08
 * @see
 */
@Data
@Component("school")
public class School {
    @Value("#{new String[] {'小明', '小红'}}")
    private String[] studentNames;

    @Value("#{{'李老师', '韦老师', '王老师'}}")
    private List<String> teacherNames;

    // 引用现有的Bean，以及创建新的Bean
    @Value("#{{@teacherBean, new com.weison.spring.complex.beans.bean.TeacherBean()}}")
    private Set<TeacherBean> teachers;

    @Value("#{{'李老师': @teacherBean.name, '小明': new com.weison.spring.complex.beans.pojo.Student().name}}")
    private Map<String, Object> events;

    @Value("#{{'学校': '幼儿园', '创建时间': '1949', '创办人': 'WeisonWei'}}")
    private Properties props;
}
