package com.woniuxy.dao;

import com.woniuxy.bean.StudentBean;

/**
 * @author chenyam
 * @title: IStudentDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 学生的数据处理
 * @date 19/06/11 下午 7:07
 */
public interface IStudentDao {
    /**
    * 功能描述:根据id查询学生
     * @param id 学生的id
    * @return: com.woniuxy.bean.StudentBean
    * @Author: chenyam
    * @Date: 19/06/11 下午 8:34
    */
    StudentBean findStudentById(int id);
}
