package com.woniu.domain;

import java.util.List;

/**
 * @author chenyam
 * @title: StudentBean
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/03 下午 8:46
 */
public class StudentBean {
    private int s_id;
    private String s_name;
    private int s_age;
    private ClassBean bean;
    private List<CourseBean> list;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        this.s_age = s_age;
    }

    public ClassBean getBean() {
        return bean;
    }

    public void setBean(ClassBean bean) {
        this.bean = bean;
    }

    public List<CourseBean> getList() {
        return list;
    }

    public void setList(List<CourseBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_age=" + s_age +
                ", bean=" + bean +
                ", list=" + list +
                '}';
    }
}
