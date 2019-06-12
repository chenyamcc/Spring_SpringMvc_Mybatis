package advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author chenyam
 * @title: MySurroundAdvice
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 环绕通知
 * @date 19/06/11 下午 2:24
 */
public class MySurroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行之前的通知");
        Object proceed = methodInvocation.proceed();
        System.out.println("方法执行之后的通知");
        return proceed;
    }
}
