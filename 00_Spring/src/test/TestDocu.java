package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shang.yining.Book;
import shang.yining.Hello;
import shang.yining.Order;

public class TestDocu {
    
    @Test
    public void testAdd() {
        
        // 1、加载 Spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean01.xml");
        
        
        
        // 2、获取配置文件创建的对象
        Hello h = context.getBean("hello", Hello.class);  // 传入 id 对应的名，和 Class 类


        System.out.println(h.hashCode());        
        
        h.hello();
    }    
    
    
    
    @Test
    public void testBook() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        
        Book b = context.getBean("book", Book.class);
        
        System.out.println("b1 = " + b.getBname() + "      " + b.getAuthor());
        
        Book b2 = context.getBean("book2", Book.class);

        System.out.println("b2 = " + b2.getBname() + "      " + b2.getAuthor());
        
        
        Book b3 = context.getBean("book3", Book.class);

        System.out.println("b3 = " + b3.getBname() + "     " + b3.getAuthor());
        
        
        
        
    }
    
    
    
    @Test
    public void testOrder() {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        
        Order order = context.getBean("order", Order.class);

        System.out.println("order = " + order.getName() + "     " + order.getAddress());
        
        
    }
    
    
    
}
