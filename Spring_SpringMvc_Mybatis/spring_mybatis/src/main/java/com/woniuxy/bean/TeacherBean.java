package com.woniuxy.bean;

import org.springframework.stereotype.Component;

/**
 * @author chenyam
 * @title: TeacherBean
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 教师类
 * @date 19/06/12 下午 12:02
 */
@Component
public class TeacherBean {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
