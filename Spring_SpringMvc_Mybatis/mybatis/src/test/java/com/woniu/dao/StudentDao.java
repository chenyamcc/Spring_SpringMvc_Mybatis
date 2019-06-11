package com.woniu.dao;

import com.woniu.domain.Student;
import com.woniu.util.MyUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
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
    public void testSelectStudentBySname() {
        //加载配置文件
        try {
            InputStream in = Resources.getResourceAsStream("config.xml");
            //获取Session工厂
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
            //获取连接对象
            SqlSession session = sessionFactory.openSession();
            //调用方法
            Student one = session.selectOne("studentMapper1.selectStudentByName", "李勇");
            System.out.println(one);
            //关闭session
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertStudent() {
        SqlSession sqlSession = MyUtil.getSqlSession();
        Student student = new Student();
        student.setSno("9655432");
        student.setSname("小田");
        student.setSsex("女");
        student.setSage(23);
        student.setSdept("数学系");
        sqlSession.insert("studentMapper1.insertStudent", student);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectAllStudent() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        List<Student> list = sqlSession.selectList("studentMapper1.selectAllStudent");
        for (Student student : list) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testDeleteStudent() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        sqlSession.delete("studentMapper1.deleteStudent", "9512101");
        sqlSession.close();
    }

    @Test
    public void testUpdateStudent() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        Student student = new Student();
        student.setSname("晓东");
        student.setSsex("女");
        student.setSno("9512102");
        sqlSession.update("studentMapper1.updateStudent", student);
        sqlSession.close();
    }
}
