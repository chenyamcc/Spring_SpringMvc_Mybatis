package com.woniuxy.dao;

import com.woniuxy.bean.StudentBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * @author chenyam
 * @title: IStudent
 * @projectName Spring_SpringMvc_Mybatis
 * @description:
 * @date 19/06/04 下午 6:48
 */
public interface IStudent {
    /**
    * 功能描述:添加学生对象
     * @param bean 传入的数据
    * @return: void
    * @Author: chenyam
    * @Date: 19/06/04 下午 8:04
    */
    @Insert("insert into t_student(stu_name,stu_age) values(#{name},#{age})")
    void  add(StudentBean bean);
    /**
    * 功能描述: 根据用户id删除用户
     * @param id 用户id
    * @return: void
    * @Author: chenyam
    * @Date: 19/06/04 下午 8:07
    */
    @Delete("delete from t_student where stu_id=#{id}")
    void del(int id);
    /**
    * 功能描述: 修改学生数据
     * @param bean
    * @return: void
    * @Author: chenyam
    * @Date: 19/06/04 下午 8:16
    */
    @Update("update t_student set stu_name=#{name} and stu_age=#{age} where stu_id=#{id}")
    void update(StudentBean bean);
}
