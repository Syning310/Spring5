package test;

import collectiontype.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean03.xml");
        
        Book b = context.getBean("book1", Book.class);

        System.out.println(b.getList());
        
        
        Book b2 = context.getBean("book1", Book.class);

        System.out.println(b.hashCode());  // 地址相同，说明是同一个对象；bean 标签中 scope 是默认值 singleton
        System.out.println(b2.hashCode());  // 当 bean 标签中，将 scope 值设置成 prototype 则代表多实例对象，地址就不相同，不是同一个对象了
        
        
    }
    
}
