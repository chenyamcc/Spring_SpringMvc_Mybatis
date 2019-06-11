package com.woniu.domain;

import java.util.List;

/**
 * @author chenyam
 * @title: ClassBean
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/04 上午 1:08
 */
public class ClassBean {
    private int c_id;
    private String c_name;
    private List<StudentBean> list;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public List<StudentBean> getList() {
        return list;
    }

    public void setList(List<StudentBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ClassBean{" +
                "c_id=" + c_id +
                ", c_name='" + c_name + '\'' +
                ", list=" + list +
                '}';
    }
}
