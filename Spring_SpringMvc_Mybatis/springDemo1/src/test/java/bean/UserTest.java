package bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyam
 * @title: UserTest
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/10 下午 8:49
 */
public class UserTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user == user2);
    }
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        user.show();
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext) context;
        context1.close();
    }
}
