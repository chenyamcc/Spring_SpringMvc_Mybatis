package com.woniu.Demo1;

/**
 * @author chenyam
 * @title: Student
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/03 上午 11:57
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private StudentClass aClass ;

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

    public StudentClass getaClass() {
        return aClass;
    }

    public void setaClass(StudentClass aClass) {
        this.aClass = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", aClass=" + aClass +
                '}';
    }
}
