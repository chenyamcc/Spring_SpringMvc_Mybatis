package com.chen.bean;

import org.springframework.stereotype.Component;

/**
 * @author chenyam
 * @title: StudentBean
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 学生类，进行数据校验和测试ajax请求
 * @date 2019/6/14 11:12
 */
    public class StudentBean {
    private String userName;
    private String passWord;
    private int age;
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
