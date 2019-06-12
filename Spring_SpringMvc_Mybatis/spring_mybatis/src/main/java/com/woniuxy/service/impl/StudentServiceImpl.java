package com.woniuxy.service.impl;

import com.woniuxy.bean.StudentBean;
import com.woniuxy.dao.IStudentDao;
import com.woniuxy.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chenyam
 * @title: StudentServiceImpl
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 对学生类的逻辑操作
 * @date 19/06/11 下午 8:19
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    private IStudentDao dao;
    @Autowired
    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    public StudentBean findStudentById(int id) {
        return dao.findStudentById(id);
    }
    @Transactional(rollbackFor = Exception.class)
    public void addStudent(StudentBean student) {
        dao.addStudent(student);
//        System.out.println(1/0);
        dao.addStudent(student);
    }
}
