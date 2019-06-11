package com.woniu.dao.interf;

import com.woniu.domain.Student;
import com.woniu.domain.StudentBean;
import org.apache.ibatis.annotations.Insert;

/**
 * @author chenyam
 * @title: IStudentDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/04 下午 3:45
 */
public interface IStudentDao {
    @Insert("insert into student(s_name.s_age) values(#{s_name,#{s_age}})")
    void add(StudentBean bean);

    void del(int id);

    void update(StudentBean bean);
}
