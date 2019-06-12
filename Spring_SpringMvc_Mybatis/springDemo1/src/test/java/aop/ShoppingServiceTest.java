package aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyam
 * @title: ShoppingServiceTest
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 测试类
 * @date 19/06/11 下午 2:35
 */
public class ShoppingServiceTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IShoppingService shoppingService = context.getBean("shoppingService",
                IShoppingService.class);
        shoppingService.shopping();
    }
}
