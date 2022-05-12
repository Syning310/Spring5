package aopanno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 增强类
@Component(value = "userProxy")
@Aspect
@Order(0)
public class UserProxy {
    
    
    // 相同切入点抽取
    @Pointcut(value = "execution(* aopanno.User.add(..))")
    public void pointdemo() {
        
    }
    
    
    // 作为前置通知方法
    // @Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("前置通知......");
        
    } 
    
    // 最终通知
    @After(value = "pointdemo()")
    public void after() {
        System.out.println("最终通知......");
    }
    
    // 后置通知
    @AfterReturning(value = "pointdemo()")
    public void afterReturning() {
        System.out.println("后置通知......");
    }
    
    
    // 异常通知
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing() {
        System.out.println("异常通知......");
    }
    
    
    // 环绕通知
    @Around(value = "pointdemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前......");

        proceedingJoinPoint.proceed();   // 被增强方法执行

        System.out.println("环绕之后......");
    }
    
    
}
