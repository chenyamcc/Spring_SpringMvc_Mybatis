package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenyam
 * @title: AjaxHandler
 * @projectName Spring_SpringMvc_Mybatis
 * @description: ajax测试
 * @date 2019/6/14 15:06
 */
@Controller
@RequestMapping("/ajax")
public class AjaxHandler {

    @RequestMapping("/demo1.do")
    @ResponseBody
    public String ajaxDemo1(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "ok";
    }
}
