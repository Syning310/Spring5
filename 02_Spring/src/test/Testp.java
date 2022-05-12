package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.config.SpringConfig;
import spring5.service.UserService;

public class Testp {
    
    
    @Test
    public void testUserService() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        
        UserService us = context.getBean("uesrService", UserService.class);

        us.add();
    }
    
    @Test
    public void testUserService2() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");

        UserService us = context.getBean("uesrService", UserService.class);
        
        us.userDAO1.add();
    }

    @Test
    public void testUserService3() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");

        UserService us = context.getBean("uesrService", UserService.class);

        System.out.println(us.in);
    }
    
    
    @Test
    public void testAnnotation() {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        UserService us = context.getBean("uesrService", UserService.class);
        
        us.add();
        
        
    }


}
