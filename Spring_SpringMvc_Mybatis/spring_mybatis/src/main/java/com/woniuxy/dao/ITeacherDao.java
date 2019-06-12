package com.woniuxy.dao;

import com.woniuxy.bean.TeacherBean;
import org.apache.ibatis.annotations.Insert;

/**
 * @author chenyam
 * @title: ITeacherDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/12 下午 12:03
 */
public interface ITeacherDao {
    @Insert("insert into t_teacher(tea_name) values(#{name})")
    void addTeacher(TeacherBean teacher);
}
