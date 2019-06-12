package advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author chenyam
 * @title: MyafterAdvice
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 后置通知
 * @date 19/06/11 下午 2:23
 */
public class MyafterAdvice implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知");
    }
}
