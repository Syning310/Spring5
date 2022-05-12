package test;

import aopanno.User;
import config.ConfigAop;
import democonfig.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
    
    @Test
    public void testAnno() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        
        User user = context.getBean("user", User.class);
        
        user.add();
        
        /*  
        无异常情况
            环绕之前......      环绕通知
            before......      前置通知
            add......         被增强方法
            afterReturning......    后置通知
            after......       最终通知
            环绕之后......      环绕通知
        有异常情况
            环绕之前......
            前置通知......
            异常通知......
            最终通知......
        */

        //System.out.println(user.getClass());    // aopanno.User$$EnhancerBySpringCGLIB$$2c1eca75

        //System.out.println(new User().getClass());  // aopanno.User
        
    }
    
    
    
    
    @Test
    public void demoBookTest() {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bookbean.xml");
        
        Book book = context.getBean("book", Book.class);

        System.out.println("book.getClass() = " + book.getClass());
        
        book.buy();
        
        
    }
    
    
    @Test
    public void testConfig() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        
        Book book = context.getBean("book", Book.class);
        
        book.buy();
        
    }
    
    
    
}
