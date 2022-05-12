package democonfig;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component(value = "bookProxy")
@Aspect
public class BookProxy {
    
    @Before(value = "execution(* democonfig.Book.buy(..))")
    public void before() {

        System.out.println("前置通知......");
        
    }
    
    
    
}
