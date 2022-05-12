package test;

import factorybean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextMyBean {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean04.xml");

        //MyBean myBean = context.getBean("myBean", MyBean.class);
        
        //System.out.println(myBean.getClass());
        
        
        
        String str = context.getBean("myBean", String.class);

        System.out.println(str.getClass());

        System.out.println(MyBean.class);
        
    }
}
