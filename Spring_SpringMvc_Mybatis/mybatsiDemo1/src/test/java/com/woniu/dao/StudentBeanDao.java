package com.woniu.dao;

import com.woniu.domain.StudentBean;
import com.woniu.util.MyUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyam
 * @title: StudentBeanDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/03 下午 8:51
 */
public class StudentBeanDao {
    @Test
    public void testFindStu() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentBean bean = new StudentBean();
//        bean.setS_id(1);
//        bean.setS_name("张三");
        List<StudentBean> beans = sqlSession.selectList("studentBeanMapper.findStudentBean", bean);
        System.out.println(beans);
    }

    @Test
    public void testFindStu2() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentBean bean = new StudentBean();
//        bean.setS_id(1);
        bean.setS_name("张三");
        List<StudentBean> beans = sqlSession.selectList("studentBeanMapper.findStudentBean2", bean);
        System.out.println(beans);
    }

    @Test
    public void testUpdateStu() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentBean bean = new StudentBean();
        bean.setS_id(1);
        bean.setS_name("张飞");
        bean.setS_age(35);
        sqlSession.update("studentBeanMapper.updateStuBean", bean);
    }

    @Test
    public void testInsertAll() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentBean bean1 = new StudentBean();
        bean1.setS_name("刘备");
        bean1.setS_age(43);
        StudentBean bean2 = new StudentBean();
        bean2.setS_name("孙权");
        bean2.setS_age(30);
        StudentBean bean3 = new StudentBean();
        bean2.setS_name("周泰");
        bean2.setS_age(29);
        List<StudentBean> beans = new ArrayList<StudentBean>();
        beans.add(bean1);
        beans.add(bean2);
        beans.add(bean3);
        sqlSession.insert("studentBeanMapper.insertAll", beans);
    }

    @Test
    public void testDelAll() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentBean bean1 = new StudentBean();
        bean1.setS_id(6);
        bean1.setS_name("刘备");
        bean1.setS_age(43);
        StudentBean bean2 = new StudentBean();
        bean2.setS_id(7);
        bean2.setS_name("孙权");
        bean2.setS_age(30);
        List<StudentBean> beans = new ArrayList<StudentBean>();
        beans.add(bean1);
        beans.add(bean2);
        sqlSession.delete("studentBeanMapper.delAll", beans);
        sqlSession.close();
    }

    @Test
    public void testfindStuBeanById() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentBean bean = sqlSession.selectOne("studentBeanMapper.findStuBeanById", 1);
        bean.getBean();
        bean.getList();
    }


    @Test
    public void testfindStuBeanById2() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentBean bean = sqlSession.selectOne("studentBeanMapper.findStuBeanById", 1);
    }
}
