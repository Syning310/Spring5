package test;

import domain.Blank;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import transaction.service.BlankService;


@Service(value = "test")
@Transactional(propagation = Propagation.REQUIRED,
        isolation = Isolation.REPEATABLE_READ, timeout = -1,
        readOnly = false, noRollbackFor = {ArithmeticException.class})
public class TestTansaction {

    @Autowired 
    @Qualifier(value = "blankService")
    BlankService service;
    
    @Test
    public void z() {
        
        //service.accountMoney();

        // 给 1 扣 1000 元
        int pp = service.myAccount(1, -1000D);
        System.out.println(pp);

        int i = 1 / 0;    // 回滚

        // 给 2 加 1000 元
        int ppp = service.myAccount(2, 1000D);
        System.out.println(ppp);
        
        
        
    }
    
    
    
}
