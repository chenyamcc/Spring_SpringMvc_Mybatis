package com.woniuxy.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author chenyam
 * @title: MyAspect
 * @projectName Spring_SpringMvc_Mybatis
 * @description:通知类
 * @date 19/06/12 上午 9:20
 */
@Aspect
@Component//这个注解必须要有,否则切面无法执行
public class MyAspect {
//    @Before("execution(* com.woniuxy.service.impl.StudentServiceImpl.*(..))")
    public void before(){
        System.out.println("前置通知");
    }
//    @After("execution(* com.woniuxy.service.impl.StudentServiceImpl.*(..))")
    public void after(){
        System.out.println("后置通知");
    }
//    @Around("execution(* com.woniuxy.service.impl.StudentServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint point) {
        System.out.println("执行之前");
        Object o =null;
        try {
            //执行方法
            o = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("执行之后");
        return o;
    }
}
