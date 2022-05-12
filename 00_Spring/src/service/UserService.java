package service;

import dao.UserDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService {
    
    private UserDAO userDAO;
    
    @Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean01.xml");
        
        UserService userService = context.getBean("userService01", UserService.class);

        userService.userDAO.add(); 
        
        
    }


    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
