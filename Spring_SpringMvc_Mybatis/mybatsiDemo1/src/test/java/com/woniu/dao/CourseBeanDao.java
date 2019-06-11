package com.woniu.dao;

import com.woniu.domain.Course;
import com.woniu.domain.CourseBean;
import com.woniu.util.MyUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author chenyam
 * @title: CourseBeanDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/04 上午 10:49
 */
public class CourseBeanDao {
    @Test
    public void testFindCouById() {
        SqlSession sqlSession = MyUtil.getSqlSession();
        CourseBean bean =  sqlSession.selectOne("courseBeanMapper.findCouById",1);
        System.out.println(bean.getList());
    }
}
