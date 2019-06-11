package com.woniuxy.bean;

/**
 * @author chenyam
 * @title: ClassBean
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 教室表
 * @date 19/06/04 下午 6:32
 */
public class ClassBean {
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

    @Override
    public String toString() {
        return "ClassBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
