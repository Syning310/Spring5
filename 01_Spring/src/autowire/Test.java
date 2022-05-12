package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("autobean.xml");
        
        Emp e = context.getBean("emp", Emp.class);

        System.out.println(e.getDept().getClass());
        
        
    }
}
