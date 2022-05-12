package spring5.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import spring5.dao.UserDAO;

import javax.annotation.Resource;

@Service(value = "uesrService")  // <bean id="userService" class="..."> </bean>
public class UserService {
    
    // 定义 dao 属性
    @Autowired     // 不需要添加 set 方法
    @Qualifier(value = "userDAO")
    private UserDAO userDAO;
    
    
    // 根据类型进行注入
    @Resource(name="userDAO")   
    public UserDAO userDAO1;
    
    @Value(value = "10")
    public Integer in;
    
    public void add() {

        System.out.println("service add......");
        userDAO.add();
    }
    
    
    
    
    
    
}
