package com.chen.controller;

import com.chen.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenyam
 * @title: RestfulHandler
 * @projectName Spring_SpringMvc_Mybatis
 * @description: restful风格访问
 * @date 2019/6/14 20:12
 */
@Controller
public class RestfulHandler {

    /**
     * 使用restful风格查询数据.
     *请求的方式必须为get
     * -@RequestBody 表示以流的形式返回数据，使用了jackson，返回的是json数据
     * @return 对象的json格式
     */
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    @ResponseBody
    public User find(){
        System.out.println("查询数据");
        User user = new User();
        user.setId(1);
        user.setUserName("aaa");
        return user;
    }

    /**
     * 添加数据，请求方式为post
     * -@RequestBody表示从服务器接收的是json格式的数据
     * @param user 前端传过来的对象的json格式
     * @return ok
     */
    @RequestMapping(value = "/student",method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody User user){
        System.out.println("添加数据");
        System.out.println(user);
        return "ok";
    }

    /**
     * 删除数据，请求方式为delete
     * 要删除的id放在访问接口后面，用/隔开
     * -PathVariable 表示从地址栏获取数据
     * @param id 用户的id
     * @return 结果
     */
    @RequestMapping(value = "/student/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String del(@PathVariable int id){
        System.out.println("删除数据");
        System.out.println(id);
        return "ok";
    }

    /**
     * 更新数据，请求方式为put
     * delete和put请求都无请求体，可以注册一个过滤器，httpPutFromContentFilter 来处理请求
     * @param user 用户新的数据
     * @return 结果
     */
    @RequestMapping(value = "/student",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("修改数据");
        System.out.println(user);
        return "ok";
    }
}
