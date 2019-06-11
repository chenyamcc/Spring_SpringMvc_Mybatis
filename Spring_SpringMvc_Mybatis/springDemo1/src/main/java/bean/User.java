package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author chenyam
 * @title: User
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 测试bean对生命周期 共11步
 * @date 19/06/10 下午 8:46
 */
public class User  implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        BeanPostProcessor, DisposableBean {
    private int id;
    private String name;

    public User() {
        System.out.println("step1:实例化对象");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("step2:对name属性进行注入");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setBeanName(String s) {
        //s为bean的id
        System.out.println("step3:设置beanName");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("step4:传入BeanFactory");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("step5:传入applicationContext对象");
    }
    public void init() {
        System.out.println("step6:执行初始化操作");
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("step7:初始化之前对操作");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(" step8:初始化之后对操作");
        return o;
    }
    public void show(){
        System.out.println("step9:执行业务操作");
    }


    public void destroy() throws Exception {
        System.out.println(" step10:执行销毁之前的操作");

    }
    public void des() {
        System.out.println("step11:执行销毁操作");
    }

}
