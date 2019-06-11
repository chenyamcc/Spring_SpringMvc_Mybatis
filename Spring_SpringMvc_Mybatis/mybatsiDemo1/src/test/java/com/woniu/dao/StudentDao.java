package com.woniu.dao;

import com.woniu.dao.interf.IStudentDao;
import com.woniu.domain.Student;
import com.woniu.domain.StudentBean;
import com.woniu.util.MyUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author chenyam
 * @title: StudentDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/01 下午 7:36
 */
public class StudentDao {
    @Test
    public void testSelectAllStudent() {
        SqlSession sqlSession = MyUtil.getSqlSession();
        Student student = sqlSession.selectOne("studentMapper.selectStudentById",1);
        System.out.println(student);
        sqlSession.close();
    }
    @Test
    public void testfndStudent() {
        SqlSession sqlSession = MyUtil.getSqlSession();
        Student student = new Student();
        student.setId(1);
//        student.setAge(20);
        List<Student> students = sqlSession.selectList("studentBeanMapper.findStudentBean",
                student);
        System.out.println(students);
    }
    @Test
    public void add(){
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        IStudentDao mapper = sqlSession.getMapper(IStudentDao.class);
        StudentBean bean = new StudentBean();
        bean.setS_name("张子服");
        bean.setS_age(65);
        mapper.add(bean);
        sqlSession.close();
    }
}
