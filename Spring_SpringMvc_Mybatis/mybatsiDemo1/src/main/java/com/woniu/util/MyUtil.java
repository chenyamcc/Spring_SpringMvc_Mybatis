package com.woniu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenyam
 * @title: MyUtil
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/01 下午 11:45
 */
public class MyUtil {
    private static String path = ("config.xml");

    public static SqlSessionFactory getsSqlSessionFactory() {
        SqlSessionFactory sessionFactory = null;
        try {
            InputStream in = Resources.getResourceAsStream(path);
            sessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = getsSqlSessionFactory().openSession();
        return sqlSession;
    }

    public static SqlSession geSqlSession(boolean boo) {
        SqlSession sqlSession = getsSqlSessionFactory().openSession(boo);
        return sqlSession;
    }
}
