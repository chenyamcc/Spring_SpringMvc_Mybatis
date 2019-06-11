package bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyam
 * @title: StudentTest
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/10 下午 9:31
 */
public class StudentTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
