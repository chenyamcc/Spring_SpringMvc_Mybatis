package com.woniu.domain;

import java.util.List;

/**
 * @author chenyam
 * @title: Student
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/03 下午 2:09
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private StudentClass studentClass;
    private List<Course> courses;

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

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", studentClass=" + studentClass +
                ", courses=" + courses +
                '}';
    }
}
