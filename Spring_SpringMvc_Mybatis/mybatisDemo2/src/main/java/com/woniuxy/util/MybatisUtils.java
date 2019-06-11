package com.woniuxy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenyam
 * @title: MybatisUtils
 * @projectName Spring_SpringMvc_Mybatis
 * @description: mybatis的工具类
 * @date 19/06/04 下午 6:35
 */
public class MybatisUtils {

    /**
    * 功能描述: 获取sqlSessionFactory对象
    * @return: org.apache.ibatis.session.SqlSessionFactory
    * @Author: chenyam
    * @Date: 19/06/04 下午 6:41
    */
    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        try {
            InputStream in = Resources.getResourceAsStream("config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    /**
    * 功能描述:获取sqlsession对象(需手动提交事务)
    * @return: org.apache.ibatis.session.SqlSession
    * @Author: chenyam
    * @Date: 19/06/04 下午 6:39
    */
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = getSqlSessionFactory().openSession();
        return sqlSession;
    }

    /**
    * 功能描述:获取sqlsession对象,自动提交事务
     * @param boo 当为true时自动提交事务,false时需要手动提交
    * @return: org.apache.ibatis.session.SqlSession
    * @Author: chenyam
    * @Date: 19/06/04 下午 6:42
    */
    public static SqlSession gSqlSession(boolean boo) {
        SqlSession sqlSession = getSqlSessionFactory().openSession(boo);
        return sqlSession;
    }
}
