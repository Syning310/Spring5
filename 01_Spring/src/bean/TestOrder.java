package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrder {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("orderbean.xml");
        
        Order order = context.getBean("ord", Order.class);
        System.out.println("4、获取创建bean实例对象");


        System.out.println(order);
        
        
        // bean实例需要手动销毁，它会调用绑定的销毁方法
        // 手动让bean实例销毁
        ((ClassPathXmlApplicationContext)context).close();
        
        
    }
}
