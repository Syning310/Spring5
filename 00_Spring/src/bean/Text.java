package bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {


    // 内部bean
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean02.xml");
        
        Employee emp = context.getBean("emp01", Employee.class);

        System.out.println(emp);
        
    }
    
    
    
    // 外部bean
    @Test
    public void TestBean() {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean04.xml");
        
        Employee emp99 = context.getBean("emp99", Employee.class);

        System.out.println(emp99);
        
        // 因为在 emp99 中，getDept对象，然后修改了 value 值，而 emp09 引用的是同一个 Dept 对象，所以 emp09 的 Dept 对象也被修改了
        
        Employee emp09 = context.getBean("emp09", Employee.class);

        System.out.println(emp09);
        
    }
    
    
}
