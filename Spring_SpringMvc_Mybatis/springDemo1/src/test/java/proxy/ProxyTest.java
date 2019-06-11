package proxy;

import org.junit.Test;
import proxy.impl.LoginServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenyam
 * @title: ProxyTest
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/10 下午 9:44
 */
public class ProxyTest {
    @Test
    public void test1() {
        //目标对象
        final ILoginService target = new LoginServiceImpl();
        //Proxy.newProxyInstance的参数:1.目标对象的类加载器 2.目标对象的所有接口 3 InvocationHandler--接口(匿名内部类)
        ILoginService proxy = (ILoginService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
            //invoke的参数:1.执行目标对象方法对返回值,目标对象的方法,目标对象方法的参数
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("日志记录");
                        method.invoke(target,args);
                        System.out.println("操作后对记录");
                        return null;
                    }
                });
        proxy.login();
        target.login();
    }
}
