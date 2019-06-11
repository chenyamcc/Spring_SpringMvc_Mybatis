package impl;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * @author chenyam
 * @title: WelcomeImplTest
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/10 上午 10:50
 */
public class WelcomeImplTest {
    @Test
    public void testSpring(){
        //获取spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring中获取对象
        Welcome welcome = (Welcome) context.getBean("welcome");
        welcome.welcome();
        System.out.println("------------------");
        //使用beanFactory获取对象
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Welcome welcome1 = (Welcome) factory.getBean("welcome");
        welcome1.welcome();
    }

}