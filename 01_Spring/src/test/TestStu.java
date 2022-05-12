package test;

import collectiontype.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestStu {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");

        Stu stu9 = context.getBean("stu9", Stu.class);

        // 输出数组
        System.out.println(Arrays.toString(stu9.getCourses()));
        
        // 输出List
        System.out.println(stu9.getBookList());
        
        // 输出Map
        System.out.println(stu9.getLook());
        
        // 输出Set
        System.out.println(stu9.getBodys());
        
        
        
    }
    
    
    
    
}
