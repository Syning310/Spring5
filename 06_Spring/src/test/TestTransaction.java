package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import syning.domain.Blank;
import syning.service.BlankService;

public class TestTransaction {
    
    
    @Test
    public void testBlank() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        BlankService blankService = context.getBean("blankService", BlankService.class);
        
        blankService.accountMoney();
        
    }
    
    
    @Test
    public void testGenericApplicationContext() {
        
        // 1、创建 GenericApplicationContext 的对象
        GenericApplicationContext context = new GenericApplicationContext();
        
        // 2、调用 context 的方法进行对象注册
        context.refresh();  // 刷新
        
        context.registerBean("b1", Blank.class, () -> new Blank());
        
        Blank b1 = context.getBean("b1", Blank.class);

        System.out.println(b1);
        
    }
    
    
    
}
