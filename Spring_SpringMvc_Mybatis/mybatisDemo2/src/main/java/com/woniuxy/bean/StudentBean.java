package com.woniuxy.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author chenyam
 * @title: StudentBean
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 学生表
 * @date 19/06/04 下午 6:32
 */
public class StudentBean implements Serializable {
    private int id;
    private String name;
    private int age;
    private ClassBean classBean;
    private List<CourseBean> courseBeanList;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClassBean getClassBean() {
        return classBean;
    }

    public void setClassBean(ClassBean classBean) {
        this.classBean = classBean;
    }

    public List<CourseBean> getCourseBeanList() {
        return courseBeanList;
    }

    public void setCourseBeanList(List<CourseBean> courseBeanList) {
        this.courseBeanList = courseBeanList;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classBean=" + classBean +
                ", courseBeanList=" + courseBeanList +
                '}';
    }
}
