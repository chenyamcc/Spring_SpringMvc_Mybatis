package com.woniu.dao;

import com.woniu.domain.Course;
import com.woniu.util.MyUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author chenyam
 * @title: CourseDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/03 下午 4:18
 */

public class CourseDao {
    @Test
    public void testFindCourseById() {
        SqlSession sqlSession = MyUtil.geSqlSession(true);
        Course course = sqlSession.selectOne("courseMapper.findCourseById",1);
        System.out.println(course);

    }
}
