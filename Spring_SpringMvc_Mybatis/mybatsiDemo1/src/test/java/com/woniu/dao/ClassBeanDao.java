package com.woniu.dao;

import com.woniu.domain.ClassBean;
import com.woniu.util.MyUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author chenyam
 * @title: ClassBeanDao
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/04 上午 10:00
 */
public class ClassBeanDao {
    @Test
    public void testFindClaBeanByCid(){
        SqlSession sqlSession = MyUtil.getSqlSession();
        ClassBean bean = sqlSession.selectOne("ClaBeanMapper.findClaBeanByCid",1);
        System.out.println(bean.getList());
    }
}
