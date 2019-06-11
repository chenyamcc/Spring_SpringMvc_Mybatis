package com.woniu.domain;

import java.util.List;

/**
 * @author chenyam
 * @title: CourseBean
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/04 上午 1:05
 */
public class CourseBean {
    private int cou_id;
    private String cou_name;
    private List<StudentBean> list;

    public int getCou_id() {
        return cou_id;
    }

    public void setCou_id(int cou_id) {
        this.cou_id = cou_id;
    }

    public String getCou_name() {
        return cou_name;
    }

    public void setCou_name(String cou_name) {
        this.cou_name = cou_name;
    }

    public List<StudentBean> getList() {
        return list;
    }

    public void setList(List<StudentBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "CourseBean{" +
                "cou_id=" + cou_id +
                ", cou_name='" + cou_name + '\'' +
                ", list=" + list +
                '}';
    }
}
