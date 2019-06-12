package com.woniuxy.service.impl;

import com.woniuxy.bean.StudentBean;
import com.woniuxy.service.IStudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author chenyam
 * @title: StudentServiceImplTest
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 测试类
 * @date 19/06/11 下午 8:50
 */
public class StudentServiceImplTest {

    @Test
    public void findStudentById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService service = (IStudentService) context.getBean("studentService");
        StudentBean bean = service.findStudentById(1);
        System.out.println(bean);
    }
}