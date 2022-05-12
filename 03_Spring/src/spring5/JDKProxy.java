package spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {
        
        // 创建接口实现类代理对象
        Class[] interfaces = {UserDAO.class};
        
        // 匿名内部类的方法
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });

        UserDAOImpl userDAOImpl = new UserDAOImpl();
        UserDAO dao = (UserDAO)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDAOProxy(userDAOImpl));
        

        System.out.println("返回的代理对象是 = " + dao.getClass());   // com.sun.proxy.$Proxy0
        System.out.println(dao.getClass());
        
        Integer ret = dao.add(1, 2);   // 会执行增强方法

        System.out.println("方法返回值 ret = " + ret);
        
        
    }
    
    
    
}


// 创建代理对象
class UserDAOProxy implements InvocationHandler {
     
    private Object obj;
    
    // 1、针对哪个类而创建的代理对象，就把哪个类传递过来
    public UserDAOProxy(Object obj) {
        // 有参构造器传递的方法
        this.obj = obj;
    }
    
    
    
    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //System.out.println(proxy == null ? "proxy 为空" : "proxy 不为空" + proxy.toString());
        
        // 方法之前做处理
        System.out.println("方法之前执行......       "  + "方法名是 = "
                + method.getName() + " : 传递的参数: " + Arrays.toString(args));
        
        // 被增强的方法执行
        Object ret = method.invoke(obj, args);    // 执行如要被增强的方法
        
        
        // 方法之后做处理
        System.out.println("方法之后执行......      obj对象 =  " + obj + "  返回值是 = " + ret);    // 就是add方法的返回值
        
        
        return ret;
    }
}


