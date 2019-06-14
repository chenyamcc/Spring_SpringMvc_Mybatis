package com.chen.controller;

import com.chen.bean.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author chenyam
 * @title: MyHandler
 * @projectName Spring_SpringMvc_Mybatis
 * @description: userHandler
 * @date 2019/6/13 18:52
 */
@Controller
@RequestMapping("/user")
public class MyHandler {
    /**
     * 基本数据类型绑定
     *
     * @param id       id
     * @param userName userName
     */
    @RequestMapping("/add.do")
    public void add(Integer id, String userName) {
        System.out.println(id);
        System.out.println(userName);
    }

    /**
     * 文件上传
     *
     * @param imageName 文件的在HTML中的name
     * @param request   用来获取ServletContext
     */
    @RequestMapping("/fileupload.do")
    public void fileUpLoad(MultipartFile imageName, HttpServletRequest request) {
        //获取文件名字
        String filename = imageName.getOriginalFilename();
        //获取tomcat,以时间戳为分隔
        String path = request.getServletContext().getRealPath("/upload");
        File file = new File(path, changefileName(filename));
        if (!file.exists()) {
            //如果该文件不存在，创建该文件
            file.mkdirs();
        }
        try {
            //将数据写到文件中
            imageName.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String changefileName(String filename) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd/");
        format.setLenient(false);
        return format.format(date) + UUID.randomUUID().toString().substring(0, 16) + filename;
    }

    /**
     * 测试参数的封装
     *
     * @param id       id
     * @param userName userName
     * @param user     user
     * @param date     date(自定义格式 yyyy-MM-dd,默认是yyyy/MM/dd)
     *                 设置了@RequestParam，默认必须有值
     *                 如果一个值有多个参数匹配，都进行注入
     *                 如果对象里有其他对象的引用，html的name采用对象属性.引用的属性进行注入
     */
    @RequestMapping("/get.do")
    public void getParameter(@RequestParam(value = "id") Integer id, String userName, User user,
                             Date date) {
        System.out.println(id);
        System.out.println(userName);
        System.out.println(user);
        System.out.println(date);
    }

    /**
     * 自定义日期转换器
     *
     * @param dataBinder mvc的数据转器
     */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //是否严格按照日期格式进行匹配
        format.setLenient(false);
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
    }

}
