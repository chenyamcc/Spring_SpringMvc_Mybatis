package com.woniu.dao;

import com.woniu.domain.StudentClass;
import com.woniu.util.MyUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author chenyam
 * @title: StdudentClassDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/03 下午 3:28
 */
public class StdudentClassDao {

    @Test
    public void testSelectStduentClassById(){
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        StudentClass studentClass = sqlSession.selectOne("studentClassMapper" +
                ".selectStudentClassById",1);
        System.out.println(studentClass);
        sqlSession.close();
    }
}
