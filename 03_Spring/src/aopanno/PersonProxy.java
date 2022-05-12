package aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(3)
public class PersonProxy {
    
    
    
    @Before(value = "execution(* aopanno.User.add(..))")
    public void before() {
        System.out.println("PersonProxy前置通知方法......");
    }
    
    
}
