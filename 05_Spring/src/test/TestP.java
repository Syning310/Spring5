package test;

import config.TxConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestP {


    public static void main(String[] args) {
        
       
        ApplicationContext context = new ClassPathXmlApplicationContext("transaction_config.xml"); // config.xml
        
        TestTansaction test = context.getBean("test", TestTansaction.class);
        
        test.z();
        
    }
    
    
}
