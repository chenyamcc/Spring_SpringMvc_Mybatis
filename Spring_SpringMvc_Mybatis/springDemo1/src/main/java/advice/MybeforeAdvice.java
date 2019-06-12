package advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author chenyam
 * @title: MybeforeAdvice
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 前置通知
 * @date 19/06/11 下午 2:22
 */
public class MybeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }
}
