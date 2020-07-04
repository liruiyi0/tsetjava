package ruiyi.li.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import ruiyi.li.spring.service.UserServiceImpl;

import java.lang.reflect.AnnotatedType;
import java.security.acl.AclNotFoundException;

public class TestSpring {
    @Test
    public void Test01(){
        //创建核心容器，并且创建了对象
        ApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");
       //从容器中获取对象
        UserServiceImpl userServicel = (UserServiceImpl)act.getBean("UserServicel");

    }
    private String name;
    private int age;
}
