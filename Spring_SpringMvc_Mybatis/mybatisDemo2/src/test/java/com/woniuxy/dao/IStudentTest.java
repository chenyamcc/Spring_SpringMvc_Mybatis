package com.woniuxy.dao;

import com.woniuxy.bean.StudentBean;
import com.woniuxy.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


/**
 * @author chenyam
 * @title: IStudentTest
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/04 下午 7:03
 */
public class IStudentTest {

    @Test
    public void testAdd() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IStudent mapper = sqlSession.getMapper(IStudent.class);
        StudentBean bean = new StudentBean();
        bean.setName("张辽");
        bean.setAge(20);
        mapper.add(bean);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDel(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IStudent mapper = sqlSession.getMapper(IStudent.class);
        mapper.del(1);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testFindStuById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentBean bean1 = sqlSession.selectOne("com.woniuxy.dao.IStudent.findStuById",7);
        sqlSession.commit();//将该查询语句和结果放入二级缓存
        StudentBean bean2 = sqlSession.selectOne("com.woniuxy.dao.IStudent.findStuById",7);

        System.out.println(bean1);
        System.out.println(bean2);



    }
}