package com.woniu.Demo1;

import java.util.List;

/**
 * @author chenyam
 * @title: StudentClass
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/03 下午 12:00
 */
public class StudentClass {
    private int id;
    private String name;
    private List<Student> studentList;

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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name=" + name +
                ", studentList=" + studentList +
                '}';
    }
}
