package test;

import collectiontype.Classes;
import collectiontype.Stu;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class TestClasses {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("bean02.xml");

        Classes cls = context.getBean("classes", Classes.class);
        
        List<Stu> stuList = cls.getStudents();
        
        for (Stu s : stuList) {
            System.out.println(Arrays.toString(s.getCourses()));
            System.out.println(s.getBookList());
            System.out.println(s.getLook());
            System.out.println(s.getBodys()); 
            
            System.out.println("--------------------------------");
        }
        
        
    }
    
    
    
    
    
    
    
    
}
