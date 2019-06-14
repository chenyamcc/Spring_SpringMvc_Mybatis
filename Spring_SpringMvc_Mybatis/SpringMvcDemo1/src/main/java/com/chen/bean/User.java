package com.chen.bean;

/**
 * @author chenyam
 * @title: User
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 用户类
 * @date 2019/6/13 20:09
 */
public class User {
    private int id;
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
