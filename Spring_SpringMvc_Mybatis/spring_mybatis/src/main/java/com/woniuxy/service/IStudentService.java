package com.woniuxy.service;

import com.woniuxy.bean.StudentBean;

/**
 * @author chenyam
 * @title: IStudentService
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 学生的业务接口
 * @date 19/06/11 下午 8:18
 */
public interface IStudentService {
    /**
    * 功能描述:通过id查找学生
     * @param id 学生id
    * @return: com.woniuxy.bean.StudentBean
    * @Author: chenyam
    * @Date: 19/06/12 上午 10:09
    */
    StudentBean findStudentById(int id);

    void addStudent(StudentBean student);
}
